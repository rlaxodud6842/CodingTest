import java.io.*;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2745
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        String jinsu10 = "123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String sentence = st.nextToken();
        int jinbub = Integer.parseInt(st.nextToken());

        int counter = 0;
        for (int j = sentence.length()-1 ; j > -1; j--){
            int now10Jinsu = jinsu10.indexOf(sentence.charAt(counter++))+1;
            sum += (int) (now10Jinsu*Math.pow(jinbub,j));
        }
        System.out.println(sum);
    }
}