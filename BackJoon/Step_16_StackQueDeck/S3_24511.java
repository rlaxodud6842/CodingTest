import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class QueueStack{
    Object[] myList;
    int N;
    QueueStack(int N){
        this.myList = new Object[N];
        this.N = N;
    }
    void initialSettingst(String str){
        for (int i = 0; i < this.N; i++){
            if(this.myList[i].getClass());
        }
    }

    void dataStructSettings(String str){
        StringTokenizer st = new StringTokenizer(str);
        for (int i = 0; i < this.N; i++){
            String dataStructType = st.nextToken();
            if(dataStructType.equals("0")){
                Queue<String> myQueue = new LinkedList<>();
                this.myList[i] = myQueue;
            }else if (dataStructType.equals("1")){
                Stack<String> myStack = new Stack<>();
                this.myList[i] = myStack;
            }
        }
    }
}

public class Main {
    static public void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        //큐스택 생성
        QueueStack myQueueStack = new QueueStack(N);
        myQueueStack.dataStructSettings(br.readLine());
        
        //큐스택 초기 값 넣기
        String initData =br.readLine();






        System.out.println(sb);
    }
}
