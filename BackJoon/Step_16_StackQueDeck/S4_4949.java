import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
    static public void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String str = br.readLine();
            if (str.equals(".")){
                break;
            }
            sb.append(solve(str)+"\n");
        }
        System.out.println(sb);
    }  
    static String solve(String str){
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < str.length(); i++){
            char nowChar = str.charAt(i);
            if (nowChar == '(' || nowChar == '['){
                myStack.push(nowChar);
            }else if(nowChar == ')'){
                if (myStack.isEmpty() || myStack.peek() != '('){
                    return "no";
                }else{
                    myStack.pop();
                }
            }else if(nowChar == ']'){
                if (myStack.isEmpty() || myStack.peek() != '['){
                    return "no";
                }else{
                    myStack.pop();
                }
            }
        }
        if(myStack.isEmpty()){
            return "yes";
        }else{
            return "no";
        }
    }
}
