import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2903
public class hello{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int num = (int) Math.pow(2,tc);
        int num2 = (int) Math.pow(num +1 , 2);
        System.out.println(num2);
    }
}