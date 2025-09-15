import java.util.*;
class Solution {
    public String solution(String bin1, String bin2) {
        StringBuilder sb = new StringBuilder();
        int max = bin1.length() > bin2.length() ? bin1.length() : bin2.length();
        int temp = 0;
        for(int i = 1; i<=max; i++){
        
            int a = getIndexBin(bin1, bin1.length()-i);
            int b = getIndexBin(bin2, bin2.length()-i);
            
            if(a+b+temp == 3){
                temp = 1;
                sb.insert(0,"1");
            }else if (a+b+temp == 2){
                temp = 1;
                sb.insert(0,"0");
            }
            else if(a+b+temp == 1){
                temp = 0;
                sb.insert(0,"1");
            }else{
                temp = 0;
                sb.insert(0,"0");
            }
        }
        
        if(temp == 1){
            sb.insert(0,"1");
        }
        
        
        return sb.toString();
    }
    
            
        public int getIndexBin(String str, int num){
            if(num<0){
                return 0;
            }
            return getInt(str.charAt(num));
        }

        public int getInt(char c){
            if(c == '1'){
                return 1;
            }else{
                return 0;
            }
        }
}