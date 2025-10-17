import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> monsterBoll = new HashSet<>();
        
        for(int i = 0; i<nums.length; i++){
            monsterBoll.add(nums[i]);
        }
        
        return monsterBoll.size() < nums.length/2 ? monsterBoll.size() : nums.length/2;
    }
}