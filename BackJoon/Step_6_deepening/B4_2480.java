import java.io.*;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2480
public class Main {

    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine());

            int FIRSTPRIZE = 10000;
            int SECONDTPRIZE = 1000;
            int THIRDPRIZE = 100;

            int TOTALPRIZE= 0;

            int firstDice = Integer.parseInt(st.nextToken());
            int secondDice = Integer.parseInt(st.nextToken());
            int thirdDice = Integer.parseInt(st.nextToken());
            int maxDice = 0;
            //경우 1: 3개 다 같을 경우
            //경우 2: 2개만 같을 경우
            //경우 3: 다 다를 경우

            if(firstDice == secondDice && secondDice == thirdDice){ //다 일치하는 경우
                TOTALPRIZE = FIRSTPRIZE + firstDice*SECONDTPRIZE;
            }else if(firstDice == secondDice || firstDice == thirdDice){ //1이랑 2, 1이랑 3만 일치하는 경우
                TOTALPRIZE = SECONDTPRIZE + firstDice*THIRDPRIZE;
            }else if (secondDice == thirdDice) { //2이랑 3 이일치하는 경우, 위에서 1과 2는 이미 비교함.
                TOTALPRIZE = SECONDTPRIZE + secondDice * THIRDPRIZE;
            }else{
                maxDice = Math.max(Math.max(firstDice,secondDice),thirdDice);
                TOTALPRIZE = maxDice * THIRDPRIZE;
            }
            bw.write(String.valueOf(TOTALPRIZE));
            bw.flush();
            bw.close();
            br.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }

}