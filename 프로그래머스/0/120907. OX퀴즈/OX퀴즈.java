import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        List<String> result = new ArrayList<>();
        List<OxQuiz> quizList = new ArrayList<>();
        
        for(int i = 0; i<quiz.length; i++){
            String[] temp = quiz[i].split(" ");
            
            int x = Integer.valueOf(temp[0]);
            char cal = temp[1].charAt(0);
            int y = Integer.valueOf(temp[2]);
            int z = Integer.valueOf(temp[4]);
            
             quizList.add(new OxQuiz(x, y, z, cal));
        }
        
        for(int i = 0; i < quizList.size(); i++){
            if(quizList.get(i).iscur()){
                result.add("O");
            }
            else{
                result.add("X");
            }
        }
        
        String[] answer = new String[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
    
    class OxQuiz{
        int X;
        int Y;
        int Z;
        char cal;
        
        public OxQuiz(int X, int Y, int Z, char cal){
            this.X = X;
            this.Y = Y;
            this.Z = Z;
            this.cal = cal;
        }
        
        boolean iscur(){
            // TODO 작성
            if(cal == '+'){
                return ((X + Y) == Z);
            }else{
                return ((X - Y) == Z);
            }
        }
    }
}