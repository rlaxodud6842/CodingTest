import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1157
public class Main {
    public static String removeDuplication(HashMap<Character,Integer> map,int maxValue){
        int counter = 0;
        char maxKey = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character k = entry.getKey();
            Integer v = entry.getValue();
            if (v == maxValue){
                counter++;
                if (counter>1){
                    return "?";
                }else{
                    maxKey = k;
                }
            }
        }
        return String.valueOf(maxKey);
    }
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            HashMap<Character,Integer> wordsMap = new HashMap<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            char[] sentence = st.nextToken().toUpperCase().toCharArray();

            for(char i:sentence){
                int frequency = wordsMap.getOrDefault(i,0);
                wordsMap.put(i,frequency+1);
            }
            int maxValue = Collections.max(wordsMap.values());


            bw.write(removeDuplication(wordsMap,maxValue));
            bw.flush();
            bw.close();
            br.close();
        }catch (Exception e){
        }
    }

}