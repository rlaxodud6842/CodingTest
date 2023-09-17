import java.util.Scanner;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10871
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int arraySize = Integer.parseInt(st.nextToken());
        int targetNumber = Integer.parseInt(st.nextToken());
        //System.out.printf("%d %d",arraySize,targetNumber);

        StringTokenizer st1 = new StringTokenizer(sc.nextLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<arraySize; i++){
            int nowNumber = Integer.parseInt(st1.nextToken());

            if(targetNumber > nowNumber){
                sb.append(nowNumber + " ");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}