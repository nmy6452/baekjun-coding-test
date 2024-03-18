public class Main {
    public static void main(String[] args) {

        //1부터 1000까지 반복하면서 i가 셀프 수인지 확인
        for (int i = 1; i < 10000; i++) {

            //1 ~ i까지 반복하면서 j의 D(j) == i면 안됨
            if (isSelf(i))
                System.out.println(i);
        }
    }

    /**
     * D(n)
     * */
    public static int selfnum(int num){
        int temp = num;
        int result = num;
        while(temp > 0){
            result += temp%10;
            temp/=10;
        }
        return result;
    }

    public static boolean isSelf(int num){
        int j = 1;
        //1 ~ i까지 반복하면서 j의 D(j) == i면 안됨
        while (true){
            int selfNum = selfnum(j);
            if (num == selfNum)
                return false;
            j ++;

            if (j >= num)
                break;
        }
        return true;
    }
}