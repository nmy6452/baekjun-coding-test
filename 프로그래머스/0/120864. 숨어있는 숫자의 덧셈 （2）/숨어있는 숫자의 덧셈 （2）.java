import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i = 0; i<my_string.length(); i++){
            if(Character.isDigit(my_string.charAt(i))){
                StringBuilder sb = new StringBuilder();
                for(int j = i; j < my_string.length(); j++){
                    i = j;
                    if(!Character.isDigit(my_string.charAt(j))){
                        break;
                    }
                    sb.append(my_string.charAt(j));
                }
                System.out.println(sb.toString());
                answer += Integer.parseInt(sb.toString());
            }
        }
        return answer;
    }
}