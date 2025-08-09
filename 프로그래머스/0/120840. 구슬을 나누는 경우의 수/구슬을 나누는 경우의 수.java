class Solution {
    public int solution(int balls, int share) {
        if (share == 0 || balls == share) return 1;

        long result = 1;
        int r = Math.min(share, balls - share); // 대칭성 활용
        
        for (int i = 1; i <= r; i++) {
            result = result * (balls - i + 1) / i;
        }

        return (int) result;
    }
}