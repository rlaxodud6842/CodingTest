import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/2587

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int avg = 0;
        for (int i = 0; i<5; i++){
            arr[i] = sc.nextInt();
            avg += arr[i];
        }
        int length = arr.length;
        for (int i = 1; i < length; i++){
            int target = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > target){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = target;
        }
        avg = avg / 5;
        System.out.println(avg);
        System.out.println(arr[2]);
    }
    //배열을 받기
}