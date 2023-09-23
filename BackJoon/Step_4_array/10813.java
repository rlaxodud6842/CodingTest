import java.util.Scanner;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10813
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int arraySize = Integer.parseInt(st.nextToken());
        int doohyunWillchange = Integer.parseInt(st.nextToken());

        //System.out.printf("%d %d",arraySize,targetNumber);

//        StringBuilder sb = new StringBuilder();
        int[] baguni = new int[arraySize];
        for(int i = 0; i<arraySize; i++){
            baguni[i] = i+1;
        }

        for (int k = 0; k < doohyunWillchange;k++){
            int i,j;
            StringTokenizer st1 = new StringTokenizer(sc.nextLine());
            i = Integer.parseInt(st1.nextToken());
            j = Integer.parseInt(st1.nextToken());

            int temp = baguni[i-1];
            baguni[i-1] = baguni[j-1];
            baguni[j-1] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for(int i : baguni){
            sb.append(i+" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}