import java.util.*;

class Solution {
    StringBuilder sb = new StringBuilder();
    public String solution(String cipher, int code) {
        String answer = "";
        int i = 1;
        while(true){
            if((i*code) > cipher.length()){
                break;
            }
            sb.append(cipher.charAt((i*code)-1));   
            i++;
        }
        return sb.toString();
    }
}