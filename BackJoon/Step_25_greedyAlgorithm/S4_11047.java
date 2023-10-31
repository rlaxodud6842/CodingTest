import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11047
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int minCoin = 0;
        Stack <Integer> coinStack = new Stack<>();

        for (int i = 0; i < N; i++){ // 코인 종류 받기
            st = new StringTokenizer(br.readLine());
            int coinType = Integer.parseInt(st.nextToken());
            coinStack.push(coinType);
        }

        for (int i = 0; i < N; i++){ // 코인종류를 하나씩 pop해서 나머지은 K값에 갱신, 몫은 mincoin에 넣기
            minCoin += K / coinStack.peek() ;
            K = K % coinStack.pop();

            if (K == 0){
                break;
            }
        }
        System.out.println(minCoin);
    }
}