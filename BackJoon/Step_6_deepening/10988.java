import java.io.*;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10988
public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringBuilder sb1 = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());

            String sentence = st.nextToken();

            sb1.append(sentence);
            String palindromeSentence = String.valueOf(sb1.reverse());

            if (sentence.equals(palindromeSentence)){
                bw.write("1");
            }else{
                bw.write("0");
            }

            bw.flush();
            bw.close();
            br.close();

        }catch (Exception e){
        }
    }
}