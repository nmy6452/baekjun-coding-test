import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        List<Integer> result = new LinkedList<>();
        
        for(int i = 0; i<my_string.length(); i++){
            Integer temp = null;
            try{
                temp = Integer.parseInt(String.valueOf(my_string.charAt(i)));    
            }
            catch(NumberFormatException ne){
                continue;
            }
            result.add(temp);
        }
        
        // Collection.sort(result);
        
        // 결과물 생성
        answer = new int[result.size()];
        for(int i = 0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}