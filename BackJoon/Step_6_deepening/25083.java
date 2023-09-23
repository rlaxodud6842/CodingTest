import java.io.*;

// https://www.acmicpc.net/problem/25083
public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            bw.write("         ,r'\"7\n" +
                    "r`-_   ,'  ,/\n" +
                    " \\. \". L_r'\n" +
                    "   `~\\/\n" +
                    "      |\n" +
                    "      |");
            bw.flush();
            bw.close();
            br.close();



        }catch (Exception e){
        }
    }
}