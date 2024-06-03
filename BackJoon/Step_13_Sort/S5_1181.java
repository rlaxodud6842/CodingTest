import java.io.*;
import java.util.*;
//https://www.acmicpc.net/problem/1181
// set 을 사용해서 중복제거하고, String 클래스의 compareTo()를 사용하면 사전순으로 잘 풀 수 있다.

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int iter = Integer.parseInt(br.readLine());
        String[] arr = new String[iter];

        for (int i = 0; i < iter; i++){
            arr[i] = br.readLine();
        }
        Set<String> set = new HashSet<String>(Arrays.asList(arr));

        String[] newArr = set.toArray(new String[set.size()]);

        Arrays.sort(newArr, (e1, e2) -> {
            if (e1.length() == e2.length()){
                return e1.compareTo(e2);
            }else{
                return e1.length() - e2.length();
            }
        });

        for (String word : newArr){
            bw.write(word + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}