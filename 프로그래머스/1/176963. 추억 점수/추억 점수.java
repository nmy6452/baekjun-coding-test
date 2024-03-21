import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        // Map<String, int> solutionYearning = new HashMap();
        Map<String, Integer> solutionYearning = new HashMap<>();
        
        for(int i = 0;  i < name.length ;i++){
            solutionYearning.put(name[i], yearning[i]);
        }
        
        for(int j = 0;  j < photo.length ;j++){
            // System.out.println(photo[j]);
            for(int k = 0;  k < photo[j].length ;k++){
                try{
                    answer[j] += solutionYearning.get(photo[j][k]);
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
                // System.out.println(photo[j][k]);
            }
             System.out.println();
        }
        
        
        
        return answer;
    }
}