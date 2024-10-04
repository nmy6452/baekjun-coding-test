class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        int denom = denom1*denom2;
        numer1 = numer1*denom2;
        numer2 = numer2*denom1;
        int numer = numer1+numer2;
        
        int gcdValue = gcd(denom, numer);
        
        
        return new int[]{numer/gcdValue, denom/gcdValue};
    }
    
        public static int gcd(int n, int m) {
        while (m != 0) {
            int tmp = n % m;
            n = m;
            m = tmp;
        }
        return n;
    }
}