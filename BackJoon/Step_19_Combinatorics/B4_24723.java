import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B4_24723 {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println((int)Math.pow(2, N));
    }
}