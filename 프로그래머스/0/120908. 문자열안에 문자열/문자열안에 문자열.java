class Solution {
    public int solution(String str1, String str2) {
        if(str1.length() < str2.length()){
            return 2;
        }
        
        for(int i = 0; i <= str1.length() - str2.length(); i++){
            
            String temp = str1.substring(i, i+str2.length());
            if(temp.equals(str2)){
                return 1;
            }
        }
        
        return 2;
    }
}