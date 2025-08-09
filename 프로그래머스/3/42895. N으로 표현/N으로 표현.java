import java.util.*;

class Solution {
    public int solution(int N, int number) {
        List<Set<Integer>> dp = new ArrayList<>();
        
        for (int i = 1; i <= 8; i++) {
            Set<Integer> currentSet = new HashSet<>();
            // N을 i번 반복해서 만든 숫자 예: 5, 55, 555 ...
            currentSet.add(Integer.parseInt(String.valueOf(N).repeat(i)));
            
            for (int j = 1; j < i; j++) {
                Set<Integer> set1 = dp.get(j - 1);
                Set<Integer> set2 = dp.get(i - j - 1);
                
                for (int a : set1) {
                    for (int b : set2) {
                        currentSet.add(a + b);
                        currentSet.add(a - b);
                        currentSet.add(a * b);
                        if (b != 0) currentSet.add(a / b);
                    }
                }
            }
            
            if (currentSet.contains(number)) {
                return i;
            }
            
            dp.add(currentSet);
        }
        return -1;
    }
}
