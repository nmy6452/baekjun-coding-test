class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i< array.length; i++){
            int temp = array[i];
            
            while(temp>0){
                System.out.println(temp%10 == 7);
                if(temp%10 == 7){
                    answer++;
                }
                temp = temp/10;
            }
        }
        return answer;
    }
}