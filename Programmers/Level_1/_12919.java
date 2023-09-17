package Level_1;
import java.util.HashMap;

//https://school.programmers.co.kr/learn/courses/30/lessons/12919
class Solution {
    public String solution(String[] seoul) {
        HashMap<String,Integer> seoulHash = new HashMap<>();
        for (int i = 0; i < seoul.length; i++){
            seoulHash.put(seoul[i],i);
        }
        int kimIndex = seoulHash.get("Kim");
        return String.format("김서방은 %d에 있다",kimIndex);
    }
}