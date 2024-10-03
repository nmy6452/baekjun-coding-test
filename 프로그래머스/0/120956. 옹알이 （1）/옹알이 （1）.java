import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public int solution(String[] babbling) {
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            if(isSpick(babbling[i]))
                answer ++;
        }
        return answer;
    }

    public boolean isSpick(String str){
        List<String> words = new ArrayList<>();
        words.add("aya");
        words.add("ye");
        words.add("woo");
        words.add("ma");

        for (int i = 0; i < 4; i++) {
            System.out.println("["+i+"]");
            for (int j = 0; j <words.size(); j++) {
                if (str.startsWith(words.get(j))) {
                    System.out.print(str + " -> ");
                    str = str.substring(words.get(j).length(), str.length());
                    words.remove(j);
                    System.out.println(str);
                    System.out.print("words: ");
                    System.out.println(words.toString());
                    break;
                }
            }
        }

        return str.length() == 0;
    }
}