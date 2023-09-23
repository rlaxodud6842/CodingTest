import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1152
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int answer = st.countTokens();

            bw.write(String.valueOf(answer));
            bw.flush();
            bw.close();
            br.close();

        }catch (Exception e){
        }
    }
}