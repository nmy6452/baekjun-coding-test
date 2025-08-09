import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        
        
        long Min = 0;
        long Max = times[times.length -1] * (long)n;
        
        while(Min <= Max){
            long Mid = (Max+Min) / 2;
            long cnt = 0;
            for(int i = 0; i<times.length; i++){
                cnt += Mid / times[i];
            }
            if(cnt < n){
                Min = Mid + 1;
            }else{
                Max = Mid - 1;
                answer = Mid;
            }
        }
        return answer;
    }
}
