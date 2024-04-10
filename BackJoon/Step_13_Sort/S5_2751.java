//https://www.acmicpc.net/problem/25305
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int iter = sc.nextInt();
        int[] arr = new int[iter];

        for (int i = 0; i<iter; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0; i<iter; i++){
            sb.append(arr[i] + "\n");
        }
        System.out.println(sb);

    }
}