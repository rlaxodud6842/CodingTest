//https://www.acmicpc.net/problem/25305

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringTokenizer st = new StringTokenizer(sc.nextLine());

        int totalCount = Integer.parseInt(st.nextToken());
        int prize = Integer.parseInt(st.nextToken());
        int[] arr = new int[totalCount];
        for (int i = 0; i < totalCount; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < totalCount; i++){
            int index = i;
            int preIndex = index;
            for(int t = i + 1; t < totalCount; t++){
                if(arr[index] > arr[t]){
                    index = t;
                }
            }
            //최소값과 바꾸는 작업
            if (index != preIndex){
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }

        }
        System.out.println(arr[totalCount-prize]);
    }
}