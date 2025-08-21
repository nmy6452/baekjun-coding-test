import java.util.*;
class Solution {
    public long solution(String numbers) {
        String[] stringNum = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};        
        for(int i = 0; i<10; i++){
            numbers = numbers.replaceAll(stringNum[i],String.valueOf(i));
        }
        
        return Long.parseLong(numbers);
    }
}