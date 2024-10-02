

import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {

        String[] strArray = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strArray[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strArray, (s1, s2) -> (s2+s1).compareTo(s1+s2));

        StringBuilder sb = new StringBuilder();
        for (String str: strArray){
            sb.append(str);
        }
        if (sb.indexOf("0") == 0)
            return "0";
        return sb.toString();
    }

    
}