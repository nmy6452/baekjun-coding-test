class Solution {
    public int solution(int[] common) {
        if(isdugcha(common)){
            // 다음 등차 구하기
            int padding = common[1] - common[0];
            return common[common.length-1] + padding;
        }else{
            // 다음 등비 구하기
            int padding = common[1] / common[0];
            return common[common.length-1] * padding;
        }
    }
    
    public boolean isdugcha(int[] common){
        int padding = common[1] - common[0];
        for(int i = 1; i<common.length-1; i++){
            if(common[i+1] - common[i] == padding){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}