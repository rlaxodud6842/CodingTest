//https://www.acmicpc.net/problem/24265
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine()); //int로 받으면 오버플로우 나니까, long으로 받았음
        System.out.println(n*n*n);
        System.out.println(3);
    }
}

//요구사항 분석
/*
MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        for j <- 1 to n
            for k <- 1 to n
                sum <- sum + A[i] × A[j] × A[k]; # 코드1
    return sum;
}
 n에 오는 숫자가 이 함수의 시간을 결정
 3중 for문인데, 각각 n까지 돌면
 O(n^3)의 시간이 걸릴것이다.
 * 
 */