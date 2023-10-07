import java.io.*;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2563
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[][] dohwaji = new int[100][100]; 
        int sackJongiiSize = Integer.parseInt(st.nextToken()); //색종이 갯수 즉 반복 횟수 받기
        int sum = 0;

        for (int i = 0; i < sackJongiiSize; i++) {
            st = new StringTokenizer(br.readLine()); //한줄 받고 x,y에 분배
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int t = 0; t < 10; t++) { // 돌면서 1을 대입
                for (int m = 0; m < 10; m++) {
                    dohwaji[t + x][m + y] = 1;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) { //겹치는부분이 어짜피 1이니까 공간은 변함없음. 따라서 겹치는 만큼 덜 세아림
                sum += dohwaji[i][j];
            }
        }
        System.out.println(sum);
    }
}