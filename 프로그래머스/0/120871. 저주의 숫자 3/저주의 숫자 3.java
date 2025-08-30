class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 0; i<n; i++){
            answer++;
            while(true){
                // 만약 3의 배수인경우
                if(answer%3 == 0){
                    answer++;
                    continue;
                }
                
                // 만약 3이 들어가는 숫자인 경우
                String temp = String.valueOf(answer);
                if(temp.contains("3")){
                    answer++;
                    continue;
                }
                break;
            }
        }
        
        return answer;
    }
}