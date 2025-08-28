class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int maxX = -256;
        int maxY = -256;
        int minX = 256;
        int minY = 256;
        
        for(int i = 0; i < dots.length; i++){
            if(maxX<dots[i][0]){
                maxX = dots[i][0];
            }
            if(minX>dots[i][0]){
                minX = dots[i][0];
            }
            
            
            if(maxY<dots[i][1]){
                maxY = dots[i][1];
            }
            if(minY>dots[i][1]){
                minY = dots[i][1];
            }
        }
        return (maxX-minX) * (maxY-minY);
    }
}