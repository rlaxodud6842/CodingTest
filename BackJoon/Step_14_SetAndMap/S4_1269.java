import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<Integer> A = new HashSet<>();
        Set<Integer> compareA = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Set<Integer> compareB = new HashSet<>();
        int answer = 0;
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            int number = Integer.parseInt(st.nextToken());
            A.add(number);
            compareA.add(number);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++){
            int number = Integer.parseInt(st.nextToken());
            B.add(number);
            compareB.add(number);
        }
        A.removeAll(compareB);
        answer += A.size();
        // B도 마찬가지로 임시셋에 담고 차집합 시켜서 더함
        B.removeAll(compareA);
        answer += B.size();

        System.out.println(answer);
    }
}