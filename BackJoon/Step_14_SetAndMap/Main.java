import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String,Integer> pocketStringLog = new HashMap<>();
        HashMap<Integer,String> pocketIntegerLog = new HashMap<>();
        String[] answerArray = new String[M];

        for (int i = 0; i < N; i++){
            String pocketMon = br.readLine();
            pocketStringLog.put(pocketMon,i + 1);
            pocketIntegerLog.put(i + 1,pocketMon);
        }
        for (int i = 0; i < M; i++){
            String exam = br.readLine();
            try{
                int examNumber = Integer.parseInt(exam);
                answerArray[i] = pocketIntegerLog.get(examNumber);
            }catch(NumberFormatException e){
                answerArray[i] = String.valueOf(pocketStringLog.get(exam));
            }
        }
        for (String element : answerArray){
            System.out.println(element);
        }
    }
}