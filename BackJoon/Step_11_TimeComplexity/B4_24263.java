//https://www.acmicpc.net/problem/24263
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine());
        System.out.println(1);
    }
}


//요구사항 분석
/*
MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        sum <- sum + A[i]; # 코드1
    return sum;
}
 n에 오는 숫자가 이 함수의 시간을 결정하기 때문에 O(n) 만큼의 시간이 걸릴것이다.
 * 
 */