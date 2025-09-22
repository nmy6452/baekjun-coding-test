import java.util.*;
class Solution {
    public int[] solution(int num, int total) {
        int index = -1000;
        
        for(int i = -1000 ; i<=1000; i++){
            int sum = 0;
            for(int j = 0; j<num; j++){
                sum += i+j; 
            }
            if(sum == total){
                index = i;
                break;
            }
        }
        
        
        int[] answer = new int[num];
        for(int i = 0; i<num; i++){
            answer[i] = index+i; 
        }
        
        return answer;
    }
}