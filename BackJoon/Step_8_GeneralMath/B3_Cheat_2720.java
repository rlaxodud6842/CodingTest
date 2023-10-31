import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

    // https://www.acmicpc.net/problem/2720
    // 의문 1: 왜 소수점을 때고 연산을 하는가
    // 의문 2: 1.24의 연산은 어떻게 하는가
    // 그리디 알고리즘 공부할것.
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while(tc-->0) {
            int money = Integer.parseInt(br.readLine());

            int q = money/25;
            money = money%25;
            int d = money/10;
            money = money%10;
            int n = money/5;
            money = money%5;
            int p = money;

            System.out.println(q+" "+d+" "+n+" "+p);
        }
    }

}