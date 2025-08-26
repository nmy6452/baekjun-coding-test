import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        List<Character> cList = new ArrayList<>();
        
        for(int i = 0; i< my_string.length(); i++){
            char temp = my_string.charAt(i);
            if(!Character.isLowerCase(temp)){
                temp = Character.toLowerCase(temp);
            }
            cList.add(temp);
        }
        
        char[] cArray = new char[cList.size()];
        
        for(int i = 0; i< cList.size(); i++){
            cArray[i] = cList.get(i);
        }
        
        Arrays.sort(cArray);
        
        return String.valueOf(cArray);
    }
}