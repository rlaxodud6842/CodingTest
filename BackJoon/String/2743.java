import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2743
public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int repeat = st.nextToken();
            for (int i = 0; i < repeat; i++){
                st.nextToken(br.readLine());

            }




            bw.write(answer);
            bw.flush();

            bw.close();
            br.close();


        }catch (Exception e){
        }
    }
}