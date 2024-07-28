import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> myDeque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        int[] dataStruct = new int[N];
        
        // 스택인지 큐인지 판단.
        StringTokenizer input1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            dataStruct[i] = Integer.parseInt(input1.nextToken());
        }
        // 초기 값 넣기. 스택은 어짜피 온거 그대로 넘기니까 생각 하지말자.
        StringTokenizer input2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            int number = Integer.parseInt(input2.nextToken());
            if(dataStruct[i] == 0){
                myDeque.addLast(number);
            }
        }
        int M = Integer.parseInt(br.readLine());
        StringTokenizer input3 = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++){
            int number = Integer.parseInt(input3.nextToken());
            myDeque.addFirst(number);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++){
            sb.append(myDeque.removeLast() + " ");
        }
        System.out.println(sb);
    }
}