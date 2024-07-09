import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        HashMap<String,String> log = new HashMap<>();
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String user = st.nextToken();
            String state = st.nextToken();
            log.put(user,state);
        }
        ArrayList<String> enterUser = new ArrayList<>();
        //해쉬맵을 
        for (Map.Entry<String,String> entry : log.entrySet()){
            String user = entry.getKey();
            String state = entry.getValue();

            if (state.equals("enter")){
                enterUser.add(user);
            }
        }
        Object[] arr = enterUser.toArray();
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);    
        }
    }
}
