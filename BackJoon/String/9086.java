import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/9086
public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int repeat = Integer.parseInt(st.nextToken());
            for (int i = 0; i < repeat; i++){
                StringBuilder sb = new StringBuilder();
                StringTokenizer st1 = new StringTokenizer(br.readLine());

                String sentence = st1.nextToken();
                int sentenceSize = sentence.length();

                sb.append(sentence.charAt(0));
                sb.append(sentence.charAt(sentenceSize-1));

                bw.write(String.valueOf(sb)+"\n");
            }
            bw.flush();
            bw.close();
            br.close();
        }catch (Exception e){
        }
    }
}