import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Stack<String> myStack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("1")){
                myStack.add(st.nextToken());
            }else if(command.equals("2")){
                try{
                    System.out.println(myStack.pop());
                }catch(EmptyStackException e){
                    System.out.println("-1");
                }
            }else if(command.equals("3")){
                System.out.println(myStack.size());
            }else if(command.equals("4")){
                if (myStack.isEmpty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }else if(command.equals("5")){
                try{
                    System.out.println(myStack.peek());
                }catch(EmptyStackException e){
                    System.out.println("-1");
                }
            }
        }
    }
}