class Solution {
    public String solution(String my_string, String letter) {
        String answer = my_string;

        while(true){  
            if(answer.indexOf(letter) == -1){
                break;
            }else{
                int index = answer.indexOf(letter);
                System.out.println(index);
                if(index+1 == answer.length()){
                    answer = answer.substring(0, index);
                }else if(index == 0){
                    answer = answer.substring(1,answer.length());
                }
                else{
                    answer = answer.substring(0, index)+answer.substring(index+1);   
                }
            }
        }
        
        return answer;
    }
}