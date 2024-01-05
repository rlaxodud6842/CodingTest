import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/5086
public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()); 
            int B = Integer.parseInt(st.nextToken());

            if (A == 0&& B == 0){
                break;
            }
            
            if (A < B && B % A == 0){
                System.out.println("factor");
            }else if (A > B && A % B == 0){
                System.out.println("multiple");
            }else{
                System.out.println("neither");
            }
        }
    }
}
 
/*
8 16
32 4
17 5
0 0 
*/