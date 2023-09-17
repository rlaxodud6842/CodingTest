package Level_0;
import java.util.Scanner;

//https://school.programmers.co.kr/learn/courses/30/lessons/181950
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String sum = "";
        for(int i =0; i<n;i++){
            sum+= str;
        }
        System.out.println(sum);
    }
}
