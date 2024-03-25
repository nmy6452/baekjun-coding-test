class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int[][] maxTree =  new int[500][500];
        
        for(int i=0; i<triangle.length; i++){
            for(int j=0; j<triangle[i].length; j++){
                
                if(i == 0){
                    maxTree[i][j] = triangle[i][j];
                }
                else{
                    if(j == 0){
                        maxTree[i][j] = triangle[i][j] + maxTree[i-1][j];
                    }
                    else if(j == triangle[i].length - 1){
                        // System.out.println(triangle[i][j] + " " + maxTree[i-1][j-1]);
                        maxTree[i][j] = triangle[i][j] + maxTree[i-1][j-1]; 
                    }
                    else{
                        // System.out.println(triangle[i][j] + " " + maxTree[i-1][j-1]);
                        int big = maxTree[i-1][j] > maxTree[i-1][j-1] ? maxTree[i-1][j] : maxTree[i-1][j-1];
                        maxTree[i][j] = triangle[i][j] + big;
                    }
                    
                    if(answer < maxTree[i][j]){
                        answer = maxTree[i][j];
                    }
                }
            }
        }
        
        // for(int i=0; i<maxTree.length; i++){
        //     for(int j=0; j<maxTree.length; j++){
        //         System.out.print(maxTree[i][j]);
        //         System.out.print(" ");
        //     }
        //     System.out.println("");
        // }
        
        return answer;
    }
}