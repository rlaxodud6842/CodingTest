import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Queue<Integer> myQueue = new LinkedList<>();
        int last = 0;
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push")){
                int number = Integer.parseInt(st.nextToken());
                myQueue.add(number);
                last = number;
            }else if (command.equals("front") ){
                if (myQueue.isEmpty()){
                    sb.append("-1"+"\n");    
                }else{
                    sb.append(myQueue.peek()+"\n");
                }
            }else if (command.equals("size")){
                sb.append(myQueue.size()+"\n");
            }else if (command.equals("empty")){
                if (myQueue.isEmpty()){
                    sb.append("1"+"\n");
                }else{
                    sb.append("0"+"\n");
                }
            }else if (command.equals("pop")){
                if (myQueue.isEmpty()){
                    sb.append("-1"+"\n");    
                }else{
                    sb.append(myQueue.poll()+"\n");
                }  
            }else if (command.equals("back")){
                if (myQueue.isEmpty()){
                    sb.append("-1"+"\n");    
                }else{
                    sb.append(last+"\n");
                }   
            }
        }
        System.out.println(sb);
    }
}