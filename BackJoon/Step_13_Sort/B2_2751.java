//https://www.acmicpc.net/problem/25305

import java.io.*;
import java.util.Arrays;


public class Main {
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void quick(int[] arr, int start,int last){
        if(start >= last) return;

        int pivot = start;
        int i = start + 1;
        int j = last;

        while(i <= j){
            while(i <= last && arr[i] <= arr[pivot])i++;
            while(j > start && arr[j] >= arr[pivot])j--;
            if(i > j){
                swap(arr,pivot,j);
            }else{
                swap(arr,i,j);
            }
        }
        quick(arr,start,j-1);
        quick(arr,j+1,last);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }
        quick(arr,0,arr.length - 1);

        for(int number : arr){
            bw.write(number+"\n");   //버퍼에 있는 값 전부 출력
            bw.flush();   //남아있는 데이터를 모두 출력시킴
        }
        bw.close();   //스트림을 닫음
    }
}