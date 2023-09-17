package Level_0;

//https://school.programmers.co.kr/learn/courses/30/lessons/181908
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int stringSize = my_string.length();
        for (int i = 0; i < stringSize;i++){
            if(my_string.substring(i,stringSize).equals(is_suffix)||my_string.equals(is_suffix)){
                answer = 1;
                return answer;
            }
        }
        return answer;
    }
}
