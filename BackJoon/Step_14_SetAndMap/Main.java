import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        //정답을 담을 answer과 듣보잡을 수집하기 위한 해시맵 생성
        ArrayList<String> answer = new ArrayList<>();
        HashMap<String,Integer> bojap = new HashMap<>();

        for (int i = 0; i < N + M; i++){
            String name = br.readLine();
            if (bojap.size() == 0){
                bojap.put(name,1);  
            }else{
                int preValue = bojap.getOrDefault(name,0);
                bojap.put(name,preValue + 1);
            }
        }
        //맵 순회해서 2번 이상이면 듣보잡임
        for (Map.Entry<String,Integer> entry : bojap.entrySet()){
            String user = entry.getKey();
            Integer times = entry.getValue();
            if (times >= 2){
                answer.add(user);
            }
        }
        //정렬함
        Object[] arr = answer.toArray();
        Arrays.sort(arr);
        //이후 출력
        System.out.println(answer.size());
        for (int i = 0; i < answer.size(); i++){
            System.out.println(arr[i]);
        }
    }
}