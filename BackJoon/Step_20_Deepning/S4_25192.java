import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int gomCounter = 0;
        HashSet<String> mySet = new HashSet<>();
        for (int i = 0; i < N; i++){
            String message = br.readLine();
            if (message.equals("ENTER")){
                gomCounter += mySet.size();
                mySet = new HashSet<>();
            }else{
                mySet.add(message);
            }
        }
        gomCounter += mySet.size();
        System.out.println(gomCounter);    
    }
}