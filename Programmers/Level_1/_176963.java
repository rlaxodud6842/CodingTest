package Level_1;
import java.util.HashMap;

//https://school.programmers.co.kr/learn/courses/30/lessons/176963


class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String,Integer> sort = sortName(name,yearning);
        for (int i = 0; i<photo.length;i++){
            int sum = 0;
            int yearningScore;
            for (int j = 0; j<photo[i].length;j++){
                if (sort.get(photo[i][j]) == null){
                    yearningScore = 0;
                }else{
                    yearningScore = (int) sort.get(photo[i][j]);
                }
                sum += yearningScore;
            }
            answer[i] = sum;

        }
        return answer;
    }
    public HashMap<String,Integer> sortName(String[] name, int[] yearning){
        HashMap<String,Integer> yearnData = new HashMap<>();
        for (int i = 0; i<name.length;i++){
            yearnData.put(name[i],yearning[i]);
        }
        return yearnData;
    }
}
