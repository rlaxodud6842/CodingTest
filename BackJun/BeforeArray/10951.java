import java.util.Scanner;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/10951
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            while (sc.hasNextLine()){
                //실행할 구문
                StringTokenizer st = new StringTokenizer(sc.nextLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());

                System.out.println(A+B);

            }
        }catch (Exception e){
        }
    }
}