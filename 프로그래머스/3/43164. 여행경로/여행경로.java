import java.util.*;

class Solution {
    boolean[] visited; // 각 티켓 사용 여부를 저장하는 배열
    ArrayList<String> allRoute; // 가능한 모든 경로를 저장하는 리스트
    
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        int cnt = 0; // 사용한 티켓의 수
        visited = new boolean[tickets.length]; // 티켓 사용 여부를 초기화
        allRoute = new ArrayList<>(); // 모든 가능한 경로를 저장할 리스트 초기화
        
        // DFS 탐색 시작, 시작점은 "ICN"
        dfs("ICN", "ICN", tickets, cnt);
        
        // 모든 경로를 정렬하여 사전순으로 가장 앞서는 경로를 선택
        Collections.sort(allRoute);
        answer = allRoute.get(0).split(" ");
        
        return answer;
    }
    
    public void dfs(String start, String route, String[][] tickets, int cnt){
        // 모든 티켓을 사용한 경우 현재 경로를 리스트에 추가
        if(cnt == tickets.length){
            allRoute.add(route);
            return;
        }
        
        // 모든 티켓을 순회하며 탐색
        for(int i = 0; i < tickets.length; i++){
            // 현재 티켓의 출발지가 시작점과 같고, 아직 사용하지 않은 티켓인 경우
            if(start.equals(tickets[i][0]) && !visited[i]){
                visited[i] = true; // 티켓 사용 표시
                // 재귀 호출을 통해 다음 경로를 탐색
                dfs(tickets[i][1], route + " " + tickets[i][1], tickets, cnt + 1);
                visited[i] = false; // 티켓 사용 취소 (백트래킹)
            }
        }
    }
}