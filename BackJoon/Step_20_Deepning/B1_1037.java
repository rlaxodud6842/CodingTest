import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        double[] hontoN = new double[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            hontoN[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(hontoN);
        double answer = hontoN[0] * hontoN[N - 1];
        System.out.printf("%.0f",answer);
    }
}