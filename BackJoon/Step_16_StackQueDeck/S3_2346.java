import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class balloon{
    int bomb;
    int index;
    public balloon(int bomb, int index){
        this.bomb = bomb;
        this.index = index;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<balloon> myDeque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++){
            int bomb= Integer.parseInt(st.nextToken());
            myDeque.add(new balloon(bomb,i));
        }
        
        balloon firstBalloon = myDeque.removeFirst();
        int firstBomb = firstBalloon.bomb;
        sb.append(firstBalloon.index + " ");
        
        while(true){
            if (firstBomb > 0){
                //양수면
                for (int i = 0; i < firstBomb - 1; i++){
                    myDeque.addLast(myDeque.removeFirst());
                }
                balloon temp = myDeque.removeFirst();
                sb.append(temp.index + " ");
                firstBomb = temp.bomb;
            }else if (firstBomb < 0){
                //음수면
                firstBomb *= -1;
                for (int i = 0; i < firstBomb - 1; i++){
                    myDeque.addFirst(myDeque.removeLast());
                }
                balloon temp = myDeque.removeLast();
                sb.append(temp.index + " ");
                firstBomb = temp.bomb;
            }
            if (myDeque.size() == 0){
                System.out.println(sb);
                break;
            }
        }

    }
}