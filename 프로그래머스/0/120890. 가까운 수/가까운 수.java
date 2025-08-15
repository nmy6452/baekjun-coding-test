class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int temp = compaer(n,array[0]);
        
        
        for(int i = 1; i< array.length; i++){    
            if (temp == compaer(n,array[i])){
                if(answer > array[i]){
                    answer = array[i];
                }
            }
            else if(temp > compaer(n,array[i])){
                temp = compaer(n,array[i]);
                answer = array[i];
            }
        }
        return answer;
    }
    
    public int compaer(int a, int b){
        if(a-b >= 0){
            return a-b;
        }
        else{
            return b-a;
        }
        
    }
}