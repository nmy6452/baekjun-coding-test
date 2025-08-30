class Solution {
    public int solution(int[][] board) {
        int[][] dp = new int[board.length][board.length];
        int answer = 0;
        
        
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                if(board[i][j] == 1){
                    dp[i][j] = 1;
                }
                if(i>0){
                    if(board[i-1][j] == 1){
                        dp[i][j] = 1;
                        continue;
                    }
                    
                    if(j>0){
                        if(board[i-1][j-1] == 1){
                            dp[i][j] = 1;
                            continue;
                        }
                    }
                    if(j<board.length-1){
                        if(board[i-1][j+1] == 1){
                            dp[i][j] = 1;
                            continue;
                        }
                    }
                }
                if(i<board.length-1){
                    if(board[i+1][j] == 1){
                        dp[i][j] = 1;
                        continue;
                    }
                    if(j>0){
                        if(board[i+1][j-1] == 1){
                            dp[i][j] = 1;
                            continue;
                        }
                    }
                    if(j<board.length-1){
                        if(board[i+1][j+1] == 1){
                            dp[i][j] = 1;
                            continue;
                        }
                    }
                }
                if(j>0){
                    if(board[i][j-1] == 1){
                        dp[i][j] = 1;
                        continue;
                    }
                }
                if(j<board.length-1){
                    if(board[i][j+1] == 1){
                        dp[i][j] = 1;
                        continue;
                    }
                }
            }
        }
        
        // for(int i = 0; i<board.length; i++){
        //     for(int j = 0; j<board.length; j++){
        //         System.out.print(board[i][j] + " ");
        //     }
        //     System.out.println("");
        // }
        // System.out.println("");
        
        for(int i = 0; i<dp.length; i++){
            for(int j = 0; j<dp.length; j++){
                // System.out.print(dp[i][j] + " ");
                if(dp[i][j] == 1){
                    answer++;
                }
            }
            System.out.println("");
        }
        return (board.length * board.length) -answer;
    }
}