import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class S5_10815 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] cards = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);

        int M = Integer.parseInt(br.readLine());
        int[] compare = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++){
            compare[i] = Integer.parseInt(st.nextToken());
        }
        for (int compareElement : compare){
            bw.write(binary(cards,N,compareElement) + " ");
        }
        bw.flush();

    }
    static int binary(int[]arr,int N, int search){
        int start = 0;
        int last = N - 1;
        int mid = 0;

        while(start <= last){
            mid = (start + last)/2;
            if(arr[mid] == search){
                return 1;
            }
            if(arr[mid] < search){
                start = mid + 1;
            }else{
                last = mid - 1;
            }
        }
        return 0;
    }
}
