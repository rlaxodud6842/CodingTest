import java.io.IOException;
import java.util.Scanner;

//https://www.acmicpc.net/problem/10809
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] ch = str.toCharArray();
        int[] answer = new int[26];
        for(int i=0; i<answer.length; i++) {
            answer[i] = -1;
        }

        for(int i=0; i<ch.length; i++) {
            int n = ch[i] - 97;
            if(answer[n] == -1) {
                answer[n] = i;
            }
        }

        for(int i=0; i<answer.length; i++) {
            System.out.print(answer[i]+" ");
        }

    }
}
