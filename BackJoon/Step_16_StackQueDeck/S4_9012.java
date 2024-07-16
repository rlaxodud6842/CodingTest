import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
    static public void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < K; i++){
            Stack<Character> myStack = new Stack<>();
            String basket = br.readLine();
            for (int j = 0; j < basket.length();j++){
                char nowBasket = basket.charAt(j);
                if (nowBasket == ')'){
                    try{if(myStack.peek()=='('){
                        myStack.pop();
                    }}catch(EmptyStackException e){
                        myStack.add(nowBasket);
                    }
                }else{
                    myStack.add(nowBasket);
                }
            }
            if(myStack.size()>0){
                sb.append("NO\n");
            }else{
                sb.append("YES\n");
            }
        }
        System.out.println(sb);
    }   
}
