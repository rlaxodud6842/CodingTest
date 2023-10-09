import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11005
public class Main {
    public static void main(String[] args) throws IOException {
        try{BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            String jinsu10 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            StringBuilder sb = new StringBuilder();
            Stack<Character>answer = new Stack<Character>();

            int number = Integer.parseInt(st.nextToken());
            int jinbub = Integer.parseInt(st.nextToken());
            int counter;

            while (number != 0){
                counter = number % jinbub;
                number =  number / jinbub;
                answer.push(jinsu10.charAt(counter));
            }
            while(!answer.isEmpty()){
                sb.append(answer.pop());
            }
            System.out.println(sb);
        }catch(Exception e){}
    }
}