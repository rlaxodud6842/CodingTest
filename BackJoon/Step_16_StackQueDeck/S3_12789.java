import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());
        Stack<Integer> myStack = new Stack<>();
        String[] numberArr = br.readLine().split(" ");
        int index = 1;
        String answer = "Nice";

        for (int i = 0; i < N; i++){
            int nowNumber = Integer.parseInt(numberArr[i]);
            if(index != nowNumber){
                if(!myStack.isEmpty() && myStack.peek() == index){
                    index++;
                    i--;
                    myStack.pop();
                }else{
                    myStack.push(nowNumber);
                }
            }else{
                index++;
            }
        }


        while(!myStack.isEmpty()){
            int popedNumber = myStack.pop();
            if(popedNumber == index){
                index++;
            }else{
                answer = "Sad";
                break;
            }
        }
        System.out.println(answer);
    }
}