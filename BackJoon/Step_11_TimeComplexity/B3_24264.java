//https://www.acmicpc.net/problem/24264
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine()); //int로 받으면 오버플로우 나니까, long으로 받았음
        System.out.println(n*n);
        System.out.println(2);
    }
}


//요구사항 분석
/*
MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        for j <- 1 to n
            sum <- sum + A[i] × A[j]; # 코드1
    return sum;
}
 n에 오는 숫자가 이 함수의 시간을 결정하기 때문에 O(n) 만큼의 시간이 걸릴것이다.
 게다가 그 안에서 또 n만큼의 반복문을 돌기 때문에 O(n^2)의 시간이 걸릴것이다.
 * 
 */