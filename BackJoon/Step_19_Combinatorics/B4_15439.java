import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        int answer;

        if(N >= 2){
            answer = N * (N - 1);
        }else{
            answer = 0;
        }
        System.out.println(answer);
    }
}