import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        // 평균 점수와 원본 인덱스를 저장
        double[] averages = new double[n];
        Integer[] indices = new Integer[n];
        
        // 1. 평균 점수 계산 및 인덱스 저장
        for (int i = 0; i < n; i++) {
            averages[i] = (score[i][0] + score[i][1]) / 2.0; // 정확한 평균을 위해 double 사용
            indices[i] = i;
        }
        
        // 2. 평균 점수를 기준으로 인덱스 정렬 (내림차순)
        Arrays.sort(indices, (a, b) -> Double.compare(averages[b], averages[a]));
        
        // 3. 등수 지정
        int[] ranks = new int[n];
        int currentRank = 1;
        
        for (int i = 0; i < n; i++) {
            if (i > 0 && averages[indices[i]] == averages[indices[i-1]]) {
                // 현재 평균이 이전과 같으면 동일한 등수 부여
                ranks[indices[i]] = ranks[indices[i-1]];
            } else {
                // 새로운 등수를 현재 위치로 지정
                ranks[indices[i]] = currentRank;
            }
            currentRank++;
        }
        
        return ranks;
    }
}