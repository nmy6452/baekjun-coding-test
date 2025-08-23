class Solution {
    public int solution(int num, int k) {
        String strNum = String.valueOf(num);
        char charK = String.valueOf(k).charAt(0);
        
        for(int i = 0; i< strNum.length(); i++){
            if(strNum.charAt(i) == charK){
                return i+1;
            }
        }
        
        return -1;
    }
}