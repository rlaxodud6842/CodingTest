import java.io.*;
import java.util.*;
//https://www.acmicpc.net/problem/1427
// int 배열을 Integer 배열로 바꿔줘야 Arrays.sort가 가능해진다.

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int iter = Integer.parseInt(br.readLine());
        int[][] arr = new int[iter][2];

        for (int i = 0; i < iter; i++){
            String line = br.readLine();
            String[] splited = line.split(" ");
            arr[i][0] = Integer.parseInt(splited[0]);
            arr[i][1] =  Integer.parseInt(splited[1]);
        }

        Arrays.sort(arr,(e1,e2)-> {
            if (e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        for(int i = 0; i < iter; i++){
            System.out.println((arr[i][0] + " " + arr[i][1]).toCharArray());
        }

    }
}