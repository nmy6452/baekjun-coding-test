import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList();
        int max = nums.length/2;
        
        //가져갈 수 있는 포켓몬의 갯수
       for(int i =0 ;i<nums.length; i++){
           if(list.size() >= max){
               break;
           }
           if(list.contains(nums[i])){
               continue;
           }else{
               list.add(nums[i]);
           }
       }
        return list.size();
    }
}