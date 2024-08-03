import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5_1010 {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double pacA = 1;
            double pacB = 1;
            for(double j=b; j>b-a; j--) {
                pacA *= j;
            }
            
            for(double k=a; k>0; k--) {
                pacB *= k;
            }
            double result = pacA/pacB;
            System.out.printf("%.0f\n",result); 
        }
    }
}