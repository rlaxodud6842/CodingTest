import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N =Integer.parseInt(st.nextToken());
        int K =Integer.parseInt(st.nextToken());
        Queue<Integer> myQueue= new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        //큐 로 다 담는다.
        //맨위에거 버리고 그다음거 dequeue를 한것을 add enqueue 해준다.

        for (int i = 1; i < N +1; i++){
            myQueue.add(i);
        }
        
        while (true) {
            if (myQueue.size() == 1){
                sb.append(myQueue.poll()+">");
                break;
            }
            for (int i = 0; i < K - 1; i++){
                myQueue.add(myQueue.poll());
            }
             sb.append(myQueue.poll() + ", ");
        }
        System.out.println(sb);
    }
}