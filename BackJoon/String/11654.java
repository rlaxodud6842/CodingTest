import java.util.Scanner;

// https://www.acmicpc.net/problem/11654
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            while (sc.hasNextLine()){
                //실행할 구문
                char aski = sc.nextLine().charAt(0);
                System.out.println((int)aski);
            }
        }catch (Exception e){
        }
    }
}