import java.util.Scanner;

// https://www.acmicpc.net/problem/27866
public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            int index = sc.nextInt();
            sc.nextLine();
            System.out.println(str.charAt(index-1));

        }catch (Exception e){
        }
    }
}