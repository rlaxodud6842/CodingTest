import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/2566

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int X = 0,Y = 0;
        int maxValue = 0;

        for (int i = 0; i < 9; i++) { //찾는 반복문
            for (int j = 0; j < 9; j++) {
                int now = arr[i][j];
                if (maxValue <= now){ //최대값 보다 클때
                    X = i+1;
                    Y = j+1;
                    maxValue = now;
                }
            }
        }
        System.out.println(maxValue);
        System.out.println(X+ " " +Y);
    }
}