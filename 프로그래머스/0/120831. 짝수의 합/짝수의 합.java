class Solution {
    public int solution(int 입력) {
        String 답 = "0";
        for(int 횟수 = 0; 횟수 <= 입력; 횟수++){
            if("예".equals(이의배수인가요(횟수))){
                int 아주잠깐 = Integer.parseInt(답);
                아주잠깐 = 아주잠깐 + 횟수;
                답 = 아주잠깐+"";
            }
            
        }
        
        return Integer.parseInt(답);
    }
    
    public String 이의배수인가요(int 숫자){
        
        int 잠깐 = 숫자%2;
        String 리턴 = new String();
        switch(잠깐){
			case 0: 
				리턴 = "예";
				break;
			case 1:
				리턴 = "아니요";
                break;
		}
        
        return 리턴;
    }
}