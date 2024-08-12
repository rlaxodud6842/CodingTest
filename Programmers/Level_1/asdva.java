import java.util.*;
class Main  {
    public int[] main() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = new int[commands.length];
        int i = 0;
        int j = 0;
        int k = 0;
        for(int t = 0; t < commands.length; t++){
            //커맨드 배열의 원소를 순회
            //temp라는 임시 배열을 만들어 command에 의해서 쪼갬.
            
            i = commands[t][0];
            j = commands[t][1];
            k = commands[t][2];
            int [] temp = new int[j - i + 1];
            
            for (int v = 0; v < temp.length;v++){
                temp[v] = array[i + 1];
                i++;
            }
            Arrays.sort(temp);
            answer[t] = temp[k];
        }
        
        return answer;
    }
}