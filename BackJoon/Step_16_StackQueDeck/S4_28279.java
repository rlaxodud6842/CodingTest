import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Deque<String> myDeque = new ArrayDeque<>();

        int N = Integer.parseInt(br .readLine());
        for (int i = 0; i < N; i++){
            
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("1")){
                myDeque.addFirst(st.nextToken());
            }else if(command.equals("2")){
                myDeque.addLast(st.nextToken());
            }else if(command.equals("3")){
                if(!myDeque.isEmpty()){
                    sb.append(myDeque.removeFirst()+"\n");
                }else{
                    sb.append("-1"+"\n");
                }
            }else if(command.equals("4")){
                if(!myDeque.isEmpty()){
                    sb.append(myDeque.removeLast()+"\n");
                }else{
                    sb.append("-1"+"\n");
                }
            }else if(command.equals("5")){
                sb.append(myDeque.size() + "\n");
            }else if(command.equals("6")){
                if(myDeque.isEmpty()){
                    sb.append("1"+"\n");
                }else{
                    sb.append("0"+"\n");
                }
            }else if(command.equals("7")){
                if(!myDeque.isEmpty()){
                    sb.append(myDeque.peekFirst()+"\n");
                }else{
                    sb.append("-1"+"\n");
                }
            }else if(command.equals("8")){
                if(!myDeque.isEmpty()){
                    sb.append(myDeque.peekLast()+"\n");
                }else{
                    sb.append("-1"+"\n");
                }
            }
        }
        System.out.println(sb);
    }
}