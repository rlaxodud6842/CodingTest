//https://www.acmicpc.net/problem/2750

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCount = sc.nextInt();

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

        for (int number : arr){
            System.out.println(number);
        }
    }
}