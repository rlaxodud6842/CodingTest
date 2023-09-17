import java.io.*;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/10952


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a,b;

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0){
                break;
            }
            bw.write(a+b+"\n");
        }


        br.close();
        bw.close();
    }
}