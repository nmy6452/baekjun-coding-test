import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000];

        for (int j : array) {
            count[j]++;
        }

        int max = 0;
        int index = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i]> max){
                max = count[i];
                index = i;
            }
        }

        int finalMax = max;
        if (Arrays.stream(count).filter(x->x == finalMax).count() > 1)
            return -1;

        return index;
    }
}