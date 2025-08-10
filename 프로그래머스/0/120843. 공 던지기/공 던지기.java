class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        // 1, 3, 5, 7, 9,
        int index = ((k-1)*2);
        return numbers[index%(numbers.length)];
    }
}