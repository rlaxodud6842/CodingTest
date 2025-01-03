class Solution {
    public int solution(String s){
        int t = 0; //같은 문자 횟수
        int f = 0; //다른 문자 횟수
        int answer = 0;
        char x = s.charAt(0);
        for(int i = 0; i < s.length(); i++){
            if(x == s.charAt(i)){
                t++;
            }else{
                f++;
            }

            if(t == f){
                t = 0;
                f = 0;
                answer++;
                if(i + 1 < s.length()){
                    x = s.charAt(i + 1);    
                }
            }
        }
        if(t > 0 || f > 0){
            answer++;
        }
        return answer;
    }
}