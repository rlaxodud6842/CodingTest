import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = 0;
        HashMap<String,Integer> myMap = new HashMap<>();
        for (int i = 0; i < N; i++){
            myMap.put(br.readLine(),0);
        }

        for (int j = 0; j < M; j++){
            if (myMap.containsKey(br.readLine())){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
