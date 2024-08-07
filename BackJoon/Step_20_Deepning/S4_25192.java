import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        HashSet<String> enterSet = new HashSet<>();
        int counter = 0;
        for (int i = 0; i < N; i++){
            String message = br.readLine();
            if(message.equals("ENTER")){
                counter += enterSet.size();
                enterSet = new HashSet<>();
            }else{
                enterSet.add(message);
            }
        }
        counter += enterSet.size();
        System.out.println(counter);
    }
}