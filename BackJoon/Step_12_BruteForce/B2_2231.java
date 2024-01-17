import java.io.*;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/2231
//refernce https://velog.io/@gayeong39/%EB%B0%B1%EC%A4%80-2231-%EB%B6%84%ED%95%B4%ED%95%A9
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());
    
    
        for(int x = -999; x < 999; x++) {
            for (int y = -999; y < 999; y++){
             if( (a*x) + (b*y) == c && (c*x) + (d*y) == f){
                String answer = x + y;
             }   
            }
        }
        System.out.println(answer);
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