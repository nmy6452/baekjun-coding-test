import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] moeum = {'a', 'e', 'i', 'o', 'u'};
        
        for(int i = 0; i< my_string.length(); i++){
            boolean isMoeum = false;
            
            for(int j=0; j< moeum.length; j++){
                if(moeum[j] == my_string.charAt(i)){
                    isMoeum = true;
                    break;
                }
            }
            if(isMoeum){
                continue;
            }
            // System.out.println("my_string.charAt("+i+"): " + my_string.charAt(i));
            answer = answer.concat(String.valueOf(my_string.charAt(i)));
        }
        
        
        return answer;
    }
}