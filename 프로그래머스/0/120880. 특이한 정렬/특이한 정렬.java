import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        
        Integer[] intList = new Integer[numlist.length];
        
        for(int i = 0; i < intList.length; i++){
            intList[i] = numlist[i];
        }

        Arrays.sort(intList, (a,b) -> {
            int atemp = a - n;
            int btemp = b - n;
            
            if(atemp < 0){
                atemp  = atemp * -1;
            }
             if(btemp < 0){
                btemp = btemp * -1;
            }
            
            if(atemp == btemp){
                return Integer.compare(b,a);
            }
            
            return Integer.compare(atemp,btemp);
        });
        
        for(int i = 0; i < numlist.length; i++){
            numlist[i] = intList[i];
        }
            
        return numlist;
    }
        
}