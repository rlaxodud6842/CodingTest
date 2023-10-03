import java.util.Scanner;

// https://www.acmicpc.net/problem/2444
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        String[] star = new String[N+1];
        int repeat = 2*N-1;

        if (N == 1){
            System.out.println("*");
        }

        for(int i = 1; i<repeat; i++){

            StringBuilder sb1 = new StringBuilder();
            int nullCounter = N - i;
            int starCounter = 2*i -1;

            while(nullCounter != 0){
                sb1.append(" ");
                nullCounter--;
            }
            while(starCounter != 0){
                sb1.append("*");
                starCounter--;
            }
            System.out.println(sb1);
            star[i] = String.valueOf(sb1);
            if(i == N){
                for(int t = i; t > 1; t--){
                    String temp = star[t-1];
                    System.out.println(temp);
                }
                break;
            }
        }
        sc.close();
    }
}