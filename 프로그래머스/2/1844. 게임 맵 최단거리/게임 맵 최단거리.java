import java.util.*;
/*
1. 최초 시작지점을 탐색 가능지점으로 큐에 입력
2. 큐에 저장되어 있는 탐색가능 지역의 거리를 계산
3. 현재 탐색중인 지역에서 상하좌우를 탐색
    3.1. 현재 탐색중인 지역의 가중치 + 1로 현제위치 가중치 설정
    3.2. 탐색가능 지역을 찾아 큐에 입력
4. 탐색 가능한 지역이 더이상 큐에 없어질때 까지 1~3을 반복
5. 최종 목적지의 가중치 값이 1> 이라면 가중치 출력 아니라면 목적지 도착불가
*/

class Solution {
    public int solution(int[][] maps) {
        return getSDist(maps);
    }
    
    public int getSDist(int[][] maps){
        //상하좌우 거리백터 초기화
        int xd[] = {1,0,-1,0};
        int yd[] = {0,1,0,-1};
        
        int[][] result = new int[maps.length][maps[0].length];
        result[0][0] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        
        //거리계산
        while(!queue.isEmpty()){
            //현재 탐색위치 지정
            int cPos[] = queue.remove();
            
            //4방위 조사
            for(int i = 0; i<4; i++){
                int nPos[] = new int[]{cPos[0]+xd[i],cPos[1]+yd[i]};
                
                //만약에 배열에서 벗어났을 경우 스킵
                if(nPos[0]<0 || nPos[1]<0 || nPos[0] > maps.length-1 || nPos[1] > maps[0].length-1){
                    continue;
                }
                
                //만약에 해당 위치가 길이라면 가중치를 계산하고 탐색가능 노드에 추가
                if(maps[nPos[0]][nPos[1]] == 1 && result[nPos[0]][nPos[1]] == 0){
                    result[nPos[0]][nPos[1]] = result[cPos[0]][cPos[1]]+1;
                    queue.add(new int[]{nPos[0], nPos[1]});
                }
                
            }
        }
        
        return result[result.length-1][result[0].length-1] > 0 ? result[result.length-1][result[0].length-1] : -1;
        
    }
}