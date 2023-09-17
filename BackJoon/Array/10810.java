import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10810
public class Main {
    public static void main(String[] args) {

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int [] baguni = new int[Integer.parseInt(st.nextToken())];
            int repeat = Integer.parseInt(st.nextToken());

            for(int t = 0; t < repeat; t++){
                st = new StringTokenizer(br.readLine());
                int i,j,k;
                i = Integer.parseInt(st.nextToken())-1;
                j = Integer.parseInt(st.nextToken())-1;
                k = Integer.parseInt(st.nextToken());
                for (;i<j+1;i++){
                    baguni[i] = k;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i:baguni){
                sb.append(i + " ");
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb);

        }catch (Exception e){
        }
    }
}