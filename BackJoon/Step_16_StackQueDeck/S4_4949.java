import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            Stack<Character> myStack = new Stack<>();
            String str = br.readLine();
            if (str.equals(".")){
                break;
            }
            for (int i = 0; i < str.length(); i++){
                char nowChar = str.charAt(i);
                if (nowChar == '('){
                    myStack.push(nowChar);
                }else if (nowChar == ')'){
                    if (myStack.isEmpty() == '('){
                        myStack.pop();
                    }
                }else if (nowChar == '['){
                    myStack.add(nowChar);
                }else if (nowChar == ']'){
                    try{if (myStack.peek() == '['){
                        myStack.pop();
                    }}catch(Exception e){
                        myStack.add(nowChar);
                    }
                }
            }
            
            if(myStack.isEmpty()){
                sb.append("yes\n");
            }else{
                sb.append("no\n");
            }
        }
        System.out.println(sb);
    }
    
}