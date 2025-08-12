import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        Set<Integer> result = new HashSet<>();
        
        for(int i = 2; i<= n; i++){
            
            if(n%i == 0){
                result.add(i);
                n = n/i;
                i--;
            }   
            if(n <= 0){
                break;
            }
        }
        
        answer = new int[result.size()];
        
        // for(int i = 0; i<result.size(); i++){
        //     answer[i] = result.get(i);
        // }
        
        int i = 0;
        for(int j: result){
            answer[i] = j;
            i++;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}