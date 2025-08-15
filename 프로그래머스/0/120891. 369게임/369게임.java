class Solution {
    public int solution(int order) {
        int answer = 0;
        
        // 한자리 숫자 리스트로 만듬
        System.out.println("order: "+ order);
        
        while(true){
            if(order == 0){
                break;
            }            
            int temp = order%10;
            if(temp == 3 ||temp == 6 ||temp == 9){
                answer++;
            }
            order/=10;

        }
        
        return answer;
    }
}