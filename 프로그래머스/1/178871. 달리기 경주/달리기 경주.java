import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rank = new HashMap<>();
        
        for(int i =0; i<players.length;i++){
            rank.put(players[i],i);
        }
        
        
        for(int i =0; i<callings.length;i++){
            //호명된 플레이어의 등수
            int temp = rank.get(callings[i]);
            
            // System.out.println("players[temp]: " + players[temp]);
            // System.out.println("temp: " + temp);
            
            //앞지름
            String swap = players[temp];
            players[temp] = players[temp-1];
            players[temp-1] = swap;
            
            //앞지른 결과 MAP에 반영
            rank.put(players[temp], temp);
            rank.put(players[temp-1], temp-1);
        }

        
        return players;
    }
}