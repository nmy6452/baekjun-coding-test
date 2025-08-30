import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int result = 0; 
        int max = sides[0] + sides[1];
        
        for(int  i = 0; i<max; i++){
            int[] temp = new int[3];
            temp[0] = sides[0];
            temp[1] = sides[1];
            temp[2] = i;
            
            Arrays.sort(temp);
            
            if(temp[0] + temp[1] > temp[2]){
                result++;
            }
            
        }
        return result;
    }
}