import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i<scoville.length; i++){
            pq.add(scoville[i]);
        }
        int result = 0;
        
        while(true){
            
            //K 이상의 스코빌지수만 남은 경우 LOOP 탈출
            if(pq.peek()>=K){
                break;
            }
            
            //더 이상 합칠 수 있는 음식이 없는 경우
            if(pq.size() <= 1){
                result = -1;
                break;
            }
        
            
            result++;
            int ferst = pq.poll();
            int second = pq.poll();
            
            int newOne = ferst + second*2;
            pq.add(newOne);
            
            
        }
        return result;
    }
}