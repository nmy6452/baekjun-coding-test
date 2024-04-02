class Solution {
    int[] dp = new int[1000000];
    public int solution(int n) {
        if(n == 0){
            return 0;
        }else if(n == 1){
            if(dp[1] == 0){
                dp[1] = n;
            }
            return dp[n];
        }
        
        int first = dp[n-1] != 0 ? dp[n-1] : solution(n-1);
        int second = dp[n-2] != 0 ? dp[n-2] : solution(n-2);
        
        dp[n] = (first + second) % 1234567;
        return (first + second) % 1234567;
    }
}