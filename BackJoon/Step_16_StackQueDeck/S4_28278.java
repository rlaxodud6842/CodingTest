import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.StringTokenizer;
// System.out.println 보다 sb에 쌓아두고 배출하는게 더 간편.
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Stack<String> myStack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++){
            
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("1")){
                myStack.add(st.nextToken());
            }else if(command.equals("2")){
                try{
                    sb.append(myStack.pop()+"\n");
                }catch(EmptyStackException e){
                    sb.append("-1"+"\n");
                }
            }else if(command.equals("3")){
                sb.append(myStack.size()+"\n");
            }else if(command.equals("4")){
                if (myStack.isEmpty()){
                    sb.append("1"+"\n");
                }else{
                    sb.append("0"+"\n");
                }
            }else if(command.equals("5")){
                try{
                    sb.append(myStack.peek()+"\n");
                }catch(EmptyStackException e){
                    sb.append("-1"+"\n");
                }
            }
        }
        System.out.println(sb);
    }
}