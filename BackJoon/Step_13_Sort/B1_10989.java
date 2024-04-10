//https://www.acmicpc.net/problem/10989
// counting sort를 써서 사용하는게 정석임. 근데 그것보다 Scanner, Stringbulider 지향하는게 더 컸던느낌

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int iter = Integer.parseInt(br.readLine());
        int[] arr = new int[iter];

        for (int i = 0; i<iter; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for (int num : arr){
            bw.write(num + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
/*
카운팅 정렬부분
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int iter = sc.nextInt();
        int[] arr = new int[iter];
        int[] count = new int[iter];


        for (int i = 0; i<iter; i++){
            arr[i] = sc.nextInt();
        }
        for (int number : arr){
            count[number]++;
        }

        for(int i = 1; i < count.length; i++) {
            // 누적 합 해주기
            count[i] += count[i - 1];
        }

        for(int i = arr.length; i <= 0; i--){
            int value = arr[i];
            count[value]--;
            arr[count[value]] = value;
        }

        for (int i = 0; i<iter; i++){
            sb.append(arr[i] + "\n");
        }

 */