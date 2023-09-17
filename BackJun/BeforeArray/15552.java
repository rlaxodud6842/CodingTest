import java.io.*;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/15552


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a,b;
        int repeat = Integer.parseInt(br.readLine());

        for (int i = 0; i < repeat; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write(a+b+"\n");
        }
        br.close();
        bw.close();
    }
}