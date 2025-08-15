import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int pre = 0;
        String[] que = s.split(" ");
        for(int i = 0; i< que.length; i++){
            try{
                 pre = Integer.parseInt(que[i]);   
                answer += pre;
            }catch(Exception e){
                answer -=pre;
            }
            // System.out.println(pre);
            // System.out.println("");
        }
        return answer;
    }
}