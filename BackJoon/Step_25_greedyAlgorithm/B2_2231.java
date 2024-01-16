import java.io.*;
//https://www.acmicpc.net/problem/2231
//refernce https://velog.io/@gayeong39/%EB%B0%B1%EC%A4%80-2231-%EB%B6%84%ED%95%B4%ED%95%A9
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = 0;
    
    
        for(int i = 1; i <= N; i++) {
            int number = i; // i값
            int res = 0; //각 자리수를 더한 값을 저장하는 변수
            
            while(number > 0){ // 해당 값이 0보다 작아질때까지 반복
                res += number % 10; // 자리수를 10씩 분해해서 해당 자리수의 모든 값을 더하여(누적) res에 저장
                number /= 10; //현재 반복을 돌고 있는 number의 값을 10씩 분해하여 계속 반복함.
            }

            if(res + i == N){ //만약 현재 i(즉 i마다 반복문 시작했을 때의 초기 number)값이랑 해당 자리수를 누적더한 값과 같을때
                M = i; // 생성자라는 뜻이니 M에 i를 넣고
                break; //반복문을 마친다.(가장 작은 생성자를 출력하니까)
            }
        }
        System.out.println(M);
    }
}