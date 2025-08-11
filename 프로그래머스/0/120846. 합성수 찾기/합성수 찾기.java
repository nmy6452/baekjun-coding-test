class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n>=1){
            int cnt=0;
            for(int i = 1; i<=n+1; i++){
                
                if(n%i == 0){
                    cnt++;
                }
                
                if(cnt >= 3){
                    break;
                }
                System.out.println("n: " + n + " i: " + i + " cnt: " + cnt);
            }
            if(cnt>=3){
                answer++;
            }
            n--;
        }
        return answer;
    }
}