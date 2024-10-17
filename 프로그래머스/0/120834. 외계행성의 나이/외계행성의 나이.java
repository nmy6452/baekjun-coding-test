import java.util.*;

class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        
        while(true){

            int startPint = (int)'a';
            int temp = age%10;
            sb.append((char)(startPint+temp));
            
            if((age/10) == 0){
                break;
            }
            age = age/10;
        }
        sb.reverse();
        
        return sb.toString();
    }
}