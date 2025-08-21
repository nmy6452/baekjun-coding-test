import java.util.*;
// a 97
// z 122
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 97; i<=122; i++){
            char temp = (char)i;
            int cnt = 0;
            for(int j = 0; j<s.length(); j++){    
                if(temp == s.charAt(j)){
                    cnt++;
                }
            }
            if(cnt == 1){
                sb.append(temp);
            }
        }
        
        
        char[] charArray = sb.toString().toCharArray();
        Arrays.sort(charArray);
        return String.copyValueOf(charArray);
    }
}