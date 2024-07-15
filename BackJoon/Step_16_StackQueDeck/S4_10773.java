import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Main {
    static public void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> myStack = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < K; i++){
            int number = Integer.parseInt(br.readLine());
            if(number == 0){
                myStack.pop();
            }else{
                myStack.add(number);
            }
        }

        while(myStack.size() > 0){
            int temp = myStack.pop();
            answer += temp;
        }

        System.out.println(answer);
    }
}
