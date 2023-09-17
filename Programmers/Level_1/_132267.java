package Level_1;
//https://school.programmers.co.kr/learn/courses/30/lessons/132267

public class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n/a > 0){
            System.out.println(n);
            answer += (n/a)*b;
            n = (n/a)*b+n%a;
        }
        return answer;
    }
}
