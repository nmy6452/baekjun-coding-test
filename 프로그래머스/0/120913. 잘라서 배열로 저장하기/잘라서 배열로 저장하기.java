import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        List<String> stringList = new ArrayList<>();
        
        while(my_str.length()>0){
            
            int max = n;
            if(max > my_str.length()){
                max = my_str.length();
            }
            stringList.add(my_str.substring(0, max));
            my_str = my_str.substring(max);
        }
        
        
        
        // 결과 값 생성
        String[] answer = new String[stringList.size()];
            for(int i = 0; i< stringList.size(); i++){
                answer[i] = stringList.get(i);
            }
        return answer;
    }
}