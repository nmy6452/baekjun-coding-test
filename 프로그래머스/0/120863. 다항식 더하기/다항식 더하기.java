import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String[] temp = polynomial.split(" \\+ ");
        int x = 0;
        int num = 0;
        
        for(int i = 0; i< temp.length; i++){
            if(temp[i].contains("x")){
                if(temp[i].length() == 1){
                    x++;
                }else{
                    x += Integer.valueOf(temp[i].substring(0,temp[i].length()-1));
                }
            }else{
                num += Integer.valueOf(temp[i]);
            }
        }
        
        StringBuilder sb = new StringBuilder();
    
        if(x > 0){
            if(x != 1){
              sb.append(x);   
            }
            sb.append("x");
        }else{
            if(num > 0){
                sb.append(num);
                return sb.toString();
            }
            
        }
        if(num > 0){
            sb.append(" + ");
            sb.append(num);
        }

        return sb.toString();
    }
}