import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class QueueStack{
    Queue<String>[] queueList;
    Stack<String>[] stackList;
    int N;
    QueueStack(int N){
        this.queueList = new Queue[N];
        this.stackList = new Stack[N];
        this.N = N;
    }

    String inputData(String str, int M){
        StringBuilder sb = new StringBuilder();
        //처음 인덱스에서 큐 해보고 아니면 스택으로 간다.
        StringTokenizer st = new StringTokenizer(str);
        for (int i = 0; i < M; i++){
            String number = st.nextToken();
            for(int j = 0; j < N; j++){
                try{
                    this.queueList[j].add(number);
                    number = this.queueList[j].poll();
                }catch(Exception e){
                    this.stackList[j].add(number);
                    number = this.stackList[j].pop();
                }
            }
            sb.append(number + " ");
        }
        return sb.toString();
    }

    void dataStructSettings(String str,String initData){
        StringTokenizer st = new StringTokenizer(str);
        StringTokenizer initst = new StringTokenizer(initData);
        for (int i = 0; i < this.N; i++){
            String dataStructType = st.nextToken();
            if(dataStructType.equals("0")){
                Queue<String> myQueue = new LinkedList<>();
                myQueue.add(initst.nextToken());
                this.queueList[i] = myQueue;
            }else if (dataStructType.equals("1")){
                Stack<String> myStack = new Stack<>();
                myStack.add(initst.nextToken());
                this.stackList[i] = myStack;
            }
        }
    }
}

public class Main {
    static public void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //큐스택 생성
        QueueStack myQueueStack = new QueueStack(N);
        myQueueStack.dataStructSettings(br.readLine(),br.readLine());
        
        //큐스택 초기 값 넣기

        int M = Integer.parseInt(br.readLine());
        String answer = myQueueStack.inputData(br.readLine(), M);


        System.out.println(answer);
    }
}
