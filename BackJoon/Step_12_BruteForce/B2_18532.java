import java.io.*;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/18532

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
    
        for(int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++){
             if( (a*x) + (b*y) == c && (d*x) + (e*y) == f){
                    sb.append(x);
                    sb.append(" ");
                    sb.append(y);
                    System.out.println(sb);
                    break;
                }   
            }
        }
    }
}


/*
 * 입력은 a b c d e f 6개
 * 
 *  ax + by = c
 *  dx + ey = f
 * 
 * 두 연립방정식을 만족하는 x y를 출력
 * 
 * 
 */