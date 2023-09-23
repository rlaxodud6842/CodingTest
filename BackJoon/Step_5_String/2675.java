import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2675
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder();

            StringTokenizer st = new StringTokenizer(br.readLine());

            int testCaseSize = Integer.parseInt(st.nextToken());

            for (int i = 0; i < testCaseSize; i++){
                StringTokenizer st1 = new StringTokenizer(br.readLine());

                int stringRepeat = Integer.parseInt(st1.nextToken());
                char[] sentence = st1.nextToken().toCharArray();

                for (char j : sentence){
                    for (int t = 0; t <stringRepeat; t++){
                        sb.append(j);
                    }
                }
                sb.append("\n");
            }
            bw.write(String.valueOf(sb));
            bw.flush();
            bw.close();
            br.close();



        }catch (Exception e){
        }
    }
}