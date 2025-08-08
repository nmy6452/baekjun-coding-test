class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int i = 0; i< numbers.length; i++){
            for(int j = i+1; j< numbers.length; j++){
                int a = numbers[i] *  numbers[j];
                System.out.println("i: " + numbers[i] + " j: "+ numbers[j]);
                System.out.println(a);
                if(a >= answer){
                    answer = a;
                }
            }   
        }        
        return answer;
    }
}