import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String,Integer> myMap = new HashMap<>();
        for (int i = 0; i < N; i++){
            String word = br.readLine();

            if(word.length() < M){
                continue;
            }

            if(myMap.isEmpty()){
                myMap.put(word,1);
            }else{
                int temp = myMap.getOrDefault(word, 0);
                myMap.put(word,temp+1);
            }
        }

        List<String> keySet = new ArrayList<>(myMap.keySet());
         // words 리스트를 정렬
        Collections.sort(keySet, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 자주 등장하는 단어 순서대로 정렬
                if (Integer.compare(myMap.get(o1), myMap.get(o2)) != 0) {
                    return Integer.compare(myMap.get(o2), myMap.get(o1));
                }
                // 등장 횟수가 같으면 길이가 긴 단어가 먼저 오도록 정렬
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }
                // 등장 횟수와 길이가 같으면 사전 순으로 정렬
                return o1.compareTo(o2);
            }
        });

        for (String word : keySet){
            bw.write(word + "\n");
        }
        bw.flush();
        
        // System.out.println(chongCounter);    
    }
}