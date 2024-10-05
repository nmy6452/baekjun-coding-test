import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            if((i%2) == 0){
                continue;
            }else {
                list.add(i);
            }
        }

        int[] resurt = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            resurt[i] = list.get(i);
        }
        return resurt;
    }
}