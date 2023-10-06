import java.io.*;

// https://www.acmicpc.net/problem/10798
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            String nowToy = br.readLine();
            for (int j = 0; j < nowToy.length(); j++) {
                try{
                    char element = nowToy.charAt(j);
                    arr[i][j] = element;
                }catch (ArrayIndexOutOfBoundsException e){
                    continue;
                }
            }
        }

        for (int i = 0; i < 15; i++) { //찾는 반복문
            for (int j = 0; j < 5; j++) {
                String element = String.valueOf(arr[j][i]);
                if (arr[j][i] != 0){
                    sb.append(element);
                }
            }
        }
        System.out.println(sb);
    }
}