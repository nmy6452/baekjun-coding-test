import java.util.*;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        // System.out.print(sides[0] +" ");
        // System.out.print(sides[1] +" ");
        // System.out.print(sides[2] +" ");
        if(sides[0] + sides[1] <= sides[2]){
            return 2;
        }
        return 1;
    }
}