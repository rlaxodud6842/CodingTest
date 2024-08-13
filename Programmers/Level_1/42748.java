import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int t = 0; t < commands.length; t++){
            //커맨드 배열의 원소를 순회
            //temp라는 임시 배열을 만들어 command에 의해서 쪼갬.
            
            int i = commands[t][0] - 1;
            int j = commands[t][1] - 1;
            int k = commands[t][2] - 1;
            ArrayList<Integer> temp = new ArrayList<>();
            
            if (i == j){
                temp.add(array[i]);
            }else{
                for(int x = i; x < j +1; x++){
                temp.add(array[x]);
            }}
            
            Collections.sort(temp);
            answer[t] = temp.get(k);
        }
        
        return answer;
    }
}