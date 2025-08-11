class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for(int i = 0; i<=n; i++){
            if(pectorial(i) <= n){
                answer = i;
            }else{
                break;
            }
            System.out.println(answer);
        }
        
        return answer;
    }
    
    public int pectorial(int num){
        if(num <= 1){
            return num;
        }
        return num * pectorial(num-1);
    }
}