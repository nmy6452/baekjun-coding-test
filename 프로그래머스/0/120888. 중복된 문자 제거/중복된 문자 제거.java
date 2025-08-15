import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        Set<String> set = new LinkedHashSet<>();
        
        for(int i = 0; i< my_string.length(); i++){
            set.add(String.valueOf(my_string.charAt(i)));
        }
        
        for(String item: set){
            sb.append(item);
        }
        
        return sb.toString();
    }
}