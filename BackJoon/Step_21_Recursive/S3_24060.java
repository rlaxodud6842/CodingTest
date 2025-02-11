import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class main {
    static int[] tmp; //정렬 후 저장하는 배열
    static int result = -1; //결과 저장 (실패시 -1)
    static int cnt = 0; //저장 횟수 누적 저장
    static int K; // 저장 횟수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 배열의 크기
        K = Integer.parseInt(st.nextToken()); // 저장 횟수
        int[] A = new int[N];
        tmp = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        merge_sort(A,0,N - 1);
        System.out.println(result);
    }
    //오름차순 정렬하는 메소드
    static void merge_sort(int[] A,int p, int r){
        if(cnt > K){return;}
        if(p < r){
            int q = (p + r) / 2;
            merge_sort(A, p, q);
            merge_sort(A, q + 1, r);

            merge(A,p,q,r);
        }

    }
    static void merge(int arr[], int p, int q, int r){
        int i = p;
        int j = q + 1;
        int t = 0;

        while (i <= q && j <= r){
            //i가 중간인덱스 q 보다 작고, 중간인덱스 j가 끝인덱스 r보다 작을때 순회
            if(arr[i] < arr[j]){
                tmp[t++] = arr[i++];
            }else{
                tmp[t++] = arr[j++];
            }
        }
        while(i <= q){
            tmp[t++] = arr[i++];
        }

        while(j <= r){
            tmp[t++] = arr[j++];
        }

        i = p;
        t = 0;
        while(i <= r){
            cnt++;
            if(cnt == K){
                result = tmp[t];
                break;
            }
            arr[i++] = tmp[t++];
        }

    }
    
}