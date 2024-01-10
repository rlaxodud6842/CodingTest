import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1978
public class Main{
    public static boolean is_sosu(int N, int M){
        if (N == 1){
            return false;
        }
        int sosu = 0;
        while (M != 0){
            if (N % (M) == 0){
                sosu++;
            }
            M--;

            if (sosu > 1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
    
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int counter = 0;

        st = new StringTokenizer(br.readLine());
        for (int t = 0; t < N; t++){
            int number = Integer.parseInt(st.nextToken());
            int M = number - 1 ;
            if (is_sosu(number, M)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}


//요구사항 분석
/*
 * 입력 : N를 입력, N개만큼의 숫자들이 한줄로 들어옴
 * 처리 : 소수는 자기 자신과 1을 약수로 가지는 수.
 * 하나라도 나눠지는게 있으면 패스
 * 각 숫자들이 소수인지 판별후 소수의 갯수를 카운드. 
 * 출력 : 소수 갯수 출력
 * 
 */