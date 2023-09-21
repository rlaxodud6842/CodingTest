import java.util.Scanner;
import java.io.*;

// https://www.acmicpc.net/problem/11720
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String garbage = br.readLine();
            String numbers = br.readLine();
            int sum = 0;

            for (int i = 0; i < numbers.length(); i++){
                String temp = String.valueOf(numbers.charAt(i));
                sum += Integer.parseInt(temp);

            }
            bw.write(String.valueOf(sum));
            bw.flush();
            bw.close();
            br.close();

        }catch (Exception e){
        }
    }
}