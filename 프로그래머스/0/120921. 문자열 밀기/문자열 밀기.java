import java.util.*;

class Solution {
    public String str;
    public int solution(String A, String B) {
        str = A;
        
        if(A.equals(B)){
            return 0;
        }
        
        
        for(int i = 1; i<=A.length(); i++){
            shift();
            if(str.equals(B)){
                return i;
            }
        }
        
        
        return -1;
    }
    
    public void shift(){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(str.length()-1));
        // 문자열 밀기
        for(int i = 0; i<str.length()-1; i++){
            sb.append(str.charAt(i));
        }
        str = sb.toString();
    }
}