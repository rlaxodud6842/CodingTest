import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/9506
public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        while(true){
            StringBuilder sb = new StringBuilder();
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); 
            int M = N - 1 ;

            if(N == -1){
                break;
            }

            sb.append(N);
            sb.append(" = ");

            Stack<Integer> stack = new Stack<Integer>();
            
            while (M != 0){
                if (N % (M) == 0){
                    stack.add(M);
                }
                M--;
            }

            int stackSize = stack.size();
            int sum = 0;
            
            for(int i = 0; i < stackSize; i++){
                //System.out.println(stack.pop());
                int temp = stack.pop();
                sum += temp;
                sb.append(temp);
                if (i != stackSize - 1){
                    sb.append(" + ");
                }
            }

            if (sum == N){
                    System.out.println(sb.toString());
            }else{
                System.out.println(N + " is NOT perfect.");
            }
        }
    }
}

//요구사항 분석
/*
 * 입력 : N를 입력
 * 처리 : N을 자기자신부터 하나씩 줄여가면서 나눠지는게 0이면 약수
 *        -> 약수들의 합이 N이되면 완전수
 * 완전수인지 판별
 * 출력 : 완전수면 N = 1 + 2 + 3 아니면 "N is NOT perfect." 출력
 * 
 */