import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());
        Queue<Integer> myQueue = new LinkedList<>();
        //큐 로 다 담는다.
        //맨위에거 버리고 그다음거 dequeue를 한것을 add enqueue 해준다.

        for (int i = 1; i < N +1; i++){
            myQueue.add(i);
        }

        
        while(true){
            if (myQueue.size() > 1){
                myQueue.poll();
                int garbage = myQueue.poll();
                myQueue.add(garbage);
            }

            if (myQueue.size() == 1){
                System.out.println(myQueue.peek());
                break;
            }
        }
    }
}