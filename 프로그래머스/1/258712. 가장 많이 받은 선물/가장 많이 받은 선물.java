
// 
// 내가 상대방에게 준 선물의 개수를 찾는 함수
//
// 내가 누구에게든 받은 선물의 개수를 찾는 함수
// 내가 누구에게든 준 선물의 개수를 찾는 함수
// 선물 지수를 구하는 함수 
// 
// 
// 
// 



class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;    
        
        int[] myGifts  = new int[50];
        for(int i = 0; i < friends.length; i++)
        {
            for(int j = i; j < friends.length; j++)
            {
                int temp = isGift(friends, gifts, i, j);
                if (temp == 1)
                {
                    myGifts[i]++;
                }
                else if(temp == 2){
                    myGifts[j]++;
                }
            }
        }
        
        for(int i = 0; i < myGifts.length; i++){
            if (answer <= myGifts[i]){
                answer = myGifts[i];
            }
        }
        
        System.out.println(answer);
        return answer;
    }
    
    public static int isGift(String[] friends, String[] gifts, int A, int B){
        
        int num = presentForOne(friends, gifts, A, B) - presentForOne(friends, gifts, B, A);
        if(num>0)
            return 1;
        else if(num<0)
            return 2;
        else
        {
            int num2 = giftper(friends, gifts, A) - giftper(friends, gifts, B);
                
            if(num2>0)
                return 1;
            else if(num2<0)
                return 2;
        }
        return 3;
    }
    
        // 선물 지수 출력
    public static int giftper(String[] friends, String[] gifts,int A){
        return presentForAnyone(friends, gifts, A) - presentFromAnyone(friends, gifts, A);
    }
    
    // 내가 누구에게든 받은 선물의 개수를 찾는 함수
    public static int presentForAnyone(String[] friends, String[] gifts,int A){
        int presentNum = 0;
        for(int i = 0; i < gifts.length; i++){
            String gift = gifts[i];
            String[] AtoB = gift.split(" ");    
            
            if(AtoB[0].equals(friends[A])){
                presentNum++;
            }
        }
        return presentNum;
    }
    
        // 내가 누구에게든 받은 선물의 개수를 찾는 함수
    public static int presentFromAnyone(String[] friends, String[] gifts,int A){
        int presentNum = 0;
        for(int i = 0; i < gifts.length; i++){
            String gift = gifts[i];
            String[] AtoB = gift.split(" ");    
            
            if(AtoB[1].equals(friends[A])){
                presentNum++;
            }
        }
        return presentNum;
    }
    
    // 내가 상대방에게 준 선물의 개수를 찾는 함수
    public static int presentForOne(String[] friends, String[] gifts, int A, int B){
        int presentNum = 0;
        String gift = friends[A] + " " + friends[B];
        
        for(int i = 0; i < gifts.length; i++){
            if(gift.equals(gifts[i])){
                presentNum++;
            }
        }
        return presentNum;
    }
}