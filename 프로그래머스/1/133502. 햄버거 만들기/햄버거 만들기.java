import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> hamburger = new ArrayList();
        List<Integer> kitchen = new ArrayList();
        
        hamburger.add(1);
        hamburger.add(2);
        hamburger.add(3);
        hamburger.add(1);
        
        for(int i =0; i < ingredient.length; i++){
            kitchen.add(ingredient[i]);
        }
        
        
        for(int i =0; i < kitchen.size()-3; i++){
            List<Integer> sublist = kitchen.subList(i,i+4);
            if (hamburger.equals(sublist)){
                answer++;
                
                kitchen.remove(i);
                kitchen.remove(i);
                kitchen.remove(i);
                kitchen.remove(i);
                if(i > 3){
                    i=i-3;
                }
                else{
                    i=-1;
                }
            }
        }
        return answer;
    }
    
//     public boolean isHamburger(List<Integer> kitchen, List<Integer> hamburger, int a){
//         boolean result = true;

//         for(int j=a; j<a+3; j++){
//             if(kitchen.get(j) != hamburger.get(j-a)){
//                 result = false;
//             }
//         }
        
//         return result;
//     }
    
    // public void printlist(List<Integer> list){
    //     for(int i = 0; i<list.size(); i++){
    //         System.out.print(list.get(i));
    //         System.out.print(" ");
    //     }
    //     System.out.println(" ");
    // }
    
    
}