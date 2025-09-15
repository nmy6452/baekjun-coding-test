class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int couponCnt = chicken;
        while(true){
            int nextChicken = couponCnt/10;
            answer += nextChicken; 
            couponCnt = couponCnt%10;
            couponCnt += nextChicken;
            
            if(couponCnt<10){
                break;
            }
        }
        return answer;
    }
}