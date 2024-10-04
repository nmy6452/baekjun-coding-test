import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        List<wlrka> wlrkaList = new ArrayList<>();
        
        int longSideMax = 0;
        int shortSideMax = 0;
        
        //지갑 초기화
        for(int i = 0; i<sizes.length;i++){
            wlrka wlrka1 = new wlrka(sizes[i][0], sizes[i][1]);
            wlrkaList.add(wlrka1);
        }
        
        for(wlrka item:wlrkaList){
            if(longSideMax < item.longSide)
                longSideMax = item.longSide;
            if(shortSideMax < item.shortSide)
                shortSideMax = item.shortSide;
        }
        return longSideMax * shortSideMax;
    }
}

class wlrka{
    int longSide;
    int shortSide;
    
    wlrka(int w, int h){
        if(w < h){
            this.longSide = h;
            this.shortSide = w;
        }else{
            this.longSide = w;
            this.shortSide = h;
        }

    }
}