import java.io.*;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/3003
public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder();

            int[] chessNumber = {1,1,2,2,2,8};

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < chessNumber.length; i++){
                int dongHyuk = Integer.parseInt(st.nextToken());
                int temp;

                if(chessNumber[i] > dongHyuk){
                    temp = chessNumber[i] - dongHyuk;
                }else if (chessNumber[i] <= dongHyuk){
                    temp = -1 * (dongHyuk - chessNumber[i])  ;
                }else{
                    continue;
                }
                chessNumber[i] = temp;
            }

            for (int i : chessNumber){
                sb.append(i + " ");
            }
            sb.deleteCharAt(sb.length() - 1);

            bw.write(String.valueOf(sb));
            bw.flush();
            bw.close();
            br.close();

        }catch (Exception e){
        }
    }
}