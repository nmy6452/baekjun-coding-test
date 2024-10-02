import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answerList = new int[commands.length];

        for (int x=0; x<commands.length; ++x){
            int i = commands[x][0]-1;
            int j = commands[x][1];
            int k = commands[x][2]-1;


            int[] ints = Arrays.copyOfRange(array, i, j);
            Arrays.sort(ints);

            answerList[x] = ints[k];
        }
        return answerList;
    }
}