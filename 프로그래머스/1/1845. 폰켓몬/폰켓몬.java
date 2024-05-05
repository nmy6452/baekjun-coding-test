import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList();
        int max = nums.length/2;
        
        //가져갈 수 있는 포켓몬의 갯수
       for(int i =0 ;i<nums.length; i++){
           if(list.size() >= max){        //만약 가져갈 수 있는 포겟몬의 수를 초과할 경우 for Loop 탈출
               break;
           }
           if(list.contains(nums[i])){     //이미 가지고 있는 포켓몬을 만날 경우 해당 무시 
               continue;
           }else{                          //가지고 있지 않는 포켓몬을 만날 경우 포켓몬 획득
               list.add(nums[i]);
           }
       }
        return list.size();                //가지고 갈 수 있는 최대의 포켓몬 종류를 출력
    }
}
