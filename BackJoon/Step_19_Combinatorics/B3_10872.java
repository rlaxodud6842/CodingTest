import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 1;
        if (N > 0){
            for (int i = 1; i < N + 1; i++){
                answer = answer * i;
            }
        }
        System.out.println(answer);

    }
}