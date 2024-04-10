class Solution {
    public int solution(int n) {
        int answer = 1;
        
        if (n <= 7){
            return answer;
        }else{
            answer = n/7;
            if(n%7 >= 1){
                return answer + 1;
            }
        }
        
        return answer;
    }
}