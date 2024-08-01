import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = N-M;

        int pacN = 1;
        int pacM = 1;
        int pacK = 1;
        for (int i = N; i > 0; i--){
            pacN *= i;
        }
        for (int i = K; i > 0; i--){
            pacK *= i;
        }
        for (int i = M; i > 0; i--){
            pacM *= i;
        }
        System.out.println(pacN / (pacM*pacK));

    }
}