import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(br.readLine());

        char resurt = str.charAt(num-1);

        System.out.println(resurt);
    }
}