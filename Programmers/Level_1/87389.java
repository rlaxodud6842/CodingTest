class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = 1;
        for (int i = 0; i < 1000000; i++){
            int left = n % x;
            if (left == 1){
                answer = x;
                break;
            }else{
                x++;
            }
        }
        return answer;
    }
}