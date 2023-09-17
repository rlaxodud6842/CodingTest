
//https://school.programmers.co.kr/learn/courses/30/lessons/181882
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for (int i = 0; i<arr.length;i++){
            int num = arr[i];
            if(num >= 50 && num%2 == 0){
                answer[i] = num/2;
            }else if(50>num && num%2 > 0){
                answer[i] = num*2;
            }else{
                answer[i] = num;
            }
        }
        return answer;
    }
}