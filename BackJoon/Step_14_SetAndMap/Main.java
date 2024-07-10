import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<String> pocketLog = new ArrayList<>();
        String[] answerArray = new String[M];
        for (int i = 0; i < N; i++){
            String pocketMon = br.readLine();
            pocketLog.add(pocketMon);
        }
        for (int i = 0; i < M; i++){
            String exam = br.readLine();
            int examIndex = 0;
            try{
                examIndex = Integer.parseInt(exam);
                answerArray[i] = pocketLog.get(examIndex);
            }catch(NumberFormatException e){
                examIndex = pocketLog.indexOf(exam);
                answerArray[i] = String.valueOf(examIndex);
            }
        }
        for (String element : answerArray){
            System.out.println(element);
        }
    }
}