import java.io.*;
import java.util.*;
//https://www.acmicpc.net/problem/1427
// int 배열을 Integer 배열로 바꿔줘야 Arrays.sort가 가능해진다.

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i);
        }

        Integer[] numbersAsInteger = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(numbersAsInteger, Collections.reverseOrder());

        for (int j : numbersAsInteger) {
            bw.write(j);
        }

        bw.flush();
        br.close();
        bw.close();


    }
}