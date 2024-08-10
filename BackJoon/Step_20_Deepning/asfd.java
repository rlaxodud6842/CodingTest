import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] numArr = new int[N];
        HashMap<Integer,Integer> myMap = new HashMap<>();
        double san = 0;
        int jung = 0;
        int choi = 0;
        int bum = 0;
        for (int i = 0; i < N; i++){
            int number = Integer.parseInt(br.readLine());
            numArr[i] = number;

            if(myMap.isEmpty()){
                myMap.put(number,1);
            }else{
                myMap.put(number,myMap.getOrDefault(myMap, 0)+1);
            }
        }
        Arrays.sort(numArr);
        //산술평균
        for(int num : numArr){
            san += num;
        }
        san = Math.round(san/ N);

        //중앙값
        jung = numArr[N/2];
        
        //최빈값
        LinkedList<Integer> keySet = new LinkedList<>(myMap.keySet());
        Collections.sort(keySet, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(myMap.get(o1),myMap.get(o2));
            }
        });
        int max = keySet.getFirst();
        if(Collections.frequency(keySet, max) > 2){
            keySet.removeFirst();
            max = keySet.getFirst();
        }
        choi = max;
        //최대값
        int tempMax = numArr[N - 1];
        int tempNMin = numArr[0];
        bum = tempMax - tempNMin;
        
        bw.write(String.format("%.0f", san) + "\n" + jung +"\n"+ choi +"\n"+ bum);
        bw.flush();
    }
}