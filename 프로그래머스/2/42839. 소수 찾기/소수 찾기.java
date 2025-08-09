import java.util.*;

class Solution {
    Set<Integer> sosuList = new HashSet<>();
    boolean[] visited;
    String numbers;

    public int solution(String numbers) {
        this.numbers = numbers;
        visited = new boolean[numbers.length()];

        dfs("");  // 가능한 모든 숫자 생성

        int answer = 0;
        for (int num : sosuList) {
            if (isSosu(num)) {
                answer++;
            }
        }
        return answer;
    }

    // DFS로 가능한 모든 숫자 생성
    public void dfs(String current) {
        if (!current.equals("")) {
            sosuList.add(Integer.parseInt(current));
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(current + numbers.charAt(i));
                visited[i] = false;
            }
        }
    }

    // 소수 판별 함수
    public boolean isSosu(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num-1; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}