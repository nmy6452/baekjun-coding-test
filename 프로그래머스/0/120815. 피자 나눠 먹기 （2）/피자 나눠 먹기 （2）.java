class Solution {
    public int solution(int n) {
        int answer = 1;
        while(true){
            int pizza = answer*6;
            System.out.println("pizza: " + pizza);
         
            //피자를 남지지 않고 다 먹을 수 있을까?
            if(pizza%n == 0){
                //모두가 피자를 동일한 숫자로 먹을 수 있을까?
                // if(){
                 return answer;
                // }
            }
            answer++;
        }
    }
}