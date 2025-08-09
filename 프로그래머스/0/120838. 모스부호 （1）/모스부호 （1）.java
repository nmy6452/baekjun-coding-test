import java.util.*;

class Solution {
    static String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public String solution(String letter) {
        String answer = "";
        
        String[] inputs = letter.split(" ");
        
        // for(int i = 0; i< inputs.length; i++){
        //     System.out.print(inputs[i] + " ");
        // }
        
        for(int i = 0; i< inputs.length; i++){
            for(int j=0; j < mos.length; j++){
                if(inputs[i].equals(mos[j])){
                    System.out.println(inputs[i]);
                    answer += (char)('a' + j);
                    break;
                }
            }
        }
        
        return answer;
    }
}