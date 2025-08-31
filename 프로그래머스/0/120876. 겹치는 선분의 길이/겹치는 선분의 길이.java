import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        Map<Integer, Integer> result = new HashMap<>();
        for(int i = 0; i< lines.length; i++){
            for(int j = lines[i][0]; j<lines[i][1]; j++){
                result.put(j,result.getOrDefault(j,0)+1);
            }
        }
        
        System.out.println(result);
        
        for(Map.Entry<Integer, Integer> entry: result.entrySet()){
            if(entry.getValue() > 1){
                answer++;
            }
        }
        return answer;
    }
}