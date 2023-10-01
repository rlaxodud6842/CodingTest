import java.io.*;

// https://www.acmicpc.net/problem/1316
// 정답 참고함, 다시 풀어볼것.
public class Main {

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i<n; i++){
            if (check(br.readLine())){
                answer++;
            }
        }
        System.out.println(answer);

    }
    public static boolean check(String sentence){
        boolean[] checkAlpha = new boolean[26];
        int prev = -1; // A일수도 있으니까 -1로 한다.
        for (int i = 0; i < sentence.length(); i++){
            int now = sentence.charAt(i);
            if (prev != now){
                if(!checkAlpha[now-97]){ //97보다 다 크니까 now - 97이 되어야 한다.
                    checkAlpha[now-97] = true;
                    prev = now;
                }else{
                    return false;
                }
            }else{
                continue;
            }
        }
        return true;
    }
}