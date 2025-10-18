import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> answer = new Stack<>();
        int pre = -1;
        
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == pre){
                continue;
            }
            
            pre = arr[i];
            answer.push(pre);
        }
        
        int[] result = new int[answer.size()];
        
        for(int i = answer.size()-1; i >= 0; i--){
            // System.out.print(answer.pop());
            result[i] = answer.pop();
        }
        
        return result;
    }
}