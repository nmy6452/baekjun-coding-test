import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i< my_string.length(); i++){
            char item = my_string.charAt(i);
            
            if(Character.isUpperCase(item)){
                sb.append(Character.toLowerCase(item));
            }else{
                sb.append(Character.toUpperCase(item));
            }
            
        }
        return sb.toString();
    }
}