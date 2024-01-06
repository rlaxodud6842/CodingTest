import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/2501
public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); 
            int K = Integer.parseInt(st.nextToken());
            int M = N - 1 ;

            Stack<Integer> stack = new Stack<Integer>();

            stack.add(N);

            while (M != 0){
                if (N % (M) == 0){
                    stack.add(M);
                }
                M--;
            }
            
            if(stack.size() < K){
                System.out.println("0");
            }else{
                for(int i = 0; i < K - 1; i++){
                    stack.pop();
                }
                System.out.println(stack.peek());
            }
        
        }
}

//요구사항 분석
/*
 * 입력 N K를 입력
 * 처리 N을 자기자신부터 하나씩 줄여가면서 나눠지는게 0이면 약수 -> 
 * 이걸 새서 K번째로 작은녀석이 뭔지 출력 
 * 
 */