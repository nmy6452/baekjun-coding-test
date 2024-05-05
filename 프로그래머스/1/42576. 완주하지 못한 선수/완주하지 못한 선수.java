import java.util.*;
/*
특징
1. 중복(동명이인)이 허용되는 경우 

brute force 하게 풀이시 시간초과
정렬해서 비교해보자

자바 정렬 알고리즘 시간복잡도 비교

Arrays.sort()
DualPivotQuicksort
평균 : O(nlog(n)) / 최악 : O(n^2)

Collections.sort()
TimeSort (삽입정렬과 합병정렬을 결합한 정렬)
평균, 최악 : O(nlog(n))
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
