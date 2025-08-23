class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        int answer = Integer.valueOf(str[0]);
        
        for(int i = 1; i<str.length; i = i+2){
            if("+".equals(str[i])){
                //더하기 연산
                answer += Integer.valueOf(str[i+1]);
            } else{
                //빼기 연산
                answer -= Integer.valueOf(str[i+1]);
            }
        }
        
        
        return answer;
    }
}