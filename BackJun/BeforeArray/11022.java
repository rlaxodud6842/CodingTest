import java.io.*;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/11022


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a,b;
        int repeat = Integer.parseInt(br.readLine());

        for (int i = 1; i < repeat+1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
        }
        br.close();
        bw.close();
    }
}