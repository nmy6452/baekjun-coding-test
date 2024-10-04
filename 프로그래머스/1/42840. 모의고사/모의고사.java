import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer1 = {1,2,3,4,5};
        int[] answer2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] answer3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] cnt = {0,0,0};
        
        for(int i = 0; i<answers.length; i++){
            if(answer1[i%answer1.length] == answers[i]){
                cnt[0]++;
            }
            if(answer2[i%answer2.length] == answers[i]){
                cnt[1]++;
            }
            if(answer3[i%answer3.length] == answers[i]){
                cnt[2]++;
            }
        }
        
        int max = 0;
        
        for(int i =0; i<cnt.length; i++){
            if(max < cnt[i]){
                max = cnt[i];
            }
        }
        
        
        int[] count = {0,0,0};
        int x = 0;
        for(int i =0; i<cnt.length; i++){
            if(max == cnt[i]){
                count[x] = i+1;
                x++;
            }
        }
                
        int[] reult = new int[x];
        
        for(int i =0; i<reult.length; i++){
            reult[i] = count[i];
        }
        
        return reult;
    }
}
