package Level_0;
import java.util.Scanner;

//https://school.programmers.co.kr/learn/courses/30/lessons/181949
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        for (int i =0; i < a.length();i++){
            char temp = a.charAt(i);
            if (65 <= temp && temp <= 90){
                answer += String.valueOf(temp).toLowerCase();
            }else if (97 <= temp && temp <= 122){
                answer += String.valueOf(temp).toUpperCase();
            }
        }
        System.out.println(answer);
    }
}