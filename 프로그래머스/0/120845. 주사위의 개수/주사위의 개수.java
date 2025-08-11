class Solution {
    public int solution(int[] box, int n) {
        /**
        10/3 = 3
        8/3= 2
        6/3 =2
        3*2*2 = 12
        
        **/
        int answer = 1;
        
        for(int i = 0; i< box.length; i++){
            answer *= box[i]/n;
        }
        
        
        return answer;
    }
}