class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        // 기약 분수로 만들기
        while(true){
            int temp = giack(a,b);
            if(temp == 0){
                break;
            }
            a = a/temp;
            b = b/temp;
        }
        
        System.out.println(a + "/" + b);
        
        
        while(true){
            System.out.println("b: "+b);
            if(b%5 == 0){
                b=b/5;
                continue;
            }
            if(b%2 == 0){
                b=b/2;
                continue;
            }
            if(b == 1){
                return 1;       
            }
            return 2;
        }
    }
    
    public int giack(int a, int b){
        int max = a > b ? a:b;
        
        for(int i = 2; i< max; i++){
            if(a%i == 0 && b%i == 0){
                return i;
            }
        }
        
        return 0;
    }
}