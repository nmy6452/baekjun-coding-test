class Solution {
   static int gen = 5;
   static int sol = 3;
   static int wok = 1;
        
    public int solution(int hp) {
        int answer = 0;
        
        
        
        answer += hp/gen;
        hp = hp%gen;
        
        System.out.println(answer);
        
        answer += hp/sol;
        hp = hp%sol;
        
        System.out.println(answer);
        
        answer += hp/wok;
        hp = hp%wok;
        
        System.out.println(answer);
        
        
        return answer;
    }
}