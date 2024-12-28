import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            StringBuffer str1 = new StringBuffer(st.nextToken());
            StringBuffer str2 = new StringBuffer(st.nextToken());

            System.out.println(Math.max(Integer.parseInt(str1.reverse().toString()), Integer.parseInt(str2.reverse().toString())));
           
    }
}