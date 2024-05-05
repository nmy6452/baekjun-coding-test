import java.util.*;
/*
특징
1. 중복(동명이인)이 허용되는 경우 

brute force 하게 풀이시 시간초과
정렬해서 비교해보자
*/

class Solution {
    public String solution(String[] participant, String[] completion) {
        ArrayList<String> participantList = new ArrayList<>(Arrays.asList(participant));
        ArrayList<String> completionList = new ArrayList<>(Arrays.asList(completion));
        Collections.sort(participantList);
        Collections.sort(completionList);
        
        for(int i = 0; i < completionList.size(); i++){
            if(!participantList.get(i).equals(completionList.get(i))){
                return participantList.get(i);
            }
        }
    
        return participantList.get(participantList.size() - 1);
        
    }
}