import java.io.*;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2941

public class Main {
    public static int croatiaCount(String sentence){
        int croatiaCount = 0;

        for(int i = 0; i<sentence.length();i++) {
            char nowElement = sentence.charAt(i); //0부터 문장 길이 까지 char형으로 저장.
            if (nowElement == 'c') { //현재 온게 c? 그리고 뒤에놈이 -,=냐
                if (sentence.charAt(i + 1) == '-' || sentence.charAt(i + 1) == '=') {
                    croatiaCount += 1;
                    i +=1;
                }else{
                    croatiaCount += 1;
                }
            }else if (nowElement == 'd') { //현재놈이 d?
                if (sentence.charAt(i + 1) == '-') {
                    croatiaCount += 1;
                    i +=1;
                } else if (sentence.charAt(i + 1) == 'z' && sentence.charAt(i + 2) == '='){
                    croatiaCount += 1;
                    i += 2;
                }else{
                    croatiaCount += 1;
                }
            } else if (nowElement == 'l') { //현재놈이 l
                if (sentence.charAt(i + 1) == 'j') {
                    croatiaCount += 1;
                    i +=1;
                }else{
                    croatiaCount += 1;
                }
            } else if (nowElement == 'n') { //현재놈이 n
                if (sentence.charAt(i + 1) == 'j') {
                    croatiaCount += 1;
                    i +=1;
                }else{
                    croatiaCount += 1;
                }
            } else if (nowElement == 's') {
                if (sentence.charAt(i+1) == '=') {
                    croatiaCount += 1;
                    i +=1;
                }else{
                    croatiaCount += 1;
                }
            } else if (nowElement == 'z') { //현재놈이 l
                if (sentence.charAt(i+1) == '=') {
                    croatiaCount += 1;
                    i +=1;
                }else{
                    croatiaCount += 1;
                }
            }else{
                System.out.println("ha");
                croatiaCount += 1;
            }
        }
        return croatiaCount;
    }


    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine());
            String sentence = st.nextToken();

            bw.write(String.valueOf(croatiaCount(sentence)));
            bw.flush();
            bw.close();
            br.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }

}