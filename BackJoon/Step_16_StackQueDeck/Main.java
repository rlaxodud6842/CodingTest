import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        Stack<Integer> myStack = new Stack<>();
        int index = 1;
        String answer = "Nice";
        
        for (int i = 0; i < N; i++){
            int currentNumber = Integer.parseInt(arr[i]);
            if (index != currentNumber){
                if(!myStack.isEmpty() && myStack.peek() == index){
                    index++;
                    i--;
                    myStack.pop();
                }else{
                    myStack.push(currentNumber);
                }
            }else{
                index++;
            }
        }

        while(!myStack.isEmpty()) {
            int lastNumber = myStack.pop();
            if (lastNumber == index){
                index++;
            }else{
                answer = "Sad";
                break;
            }
        }
        System.out.println(answer);
    }
}