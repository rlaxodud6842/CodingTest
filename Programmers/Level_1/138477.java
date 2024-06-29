import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        //명예의 전당에는 높은애들이 들어감.
        LinkedList<Integer> honor = new LinkedList<>();
        for (int i = 0; i < score.length;i++){
            int newScore = score[i]; 
            if (honor.size() == k){
                //사이즈가 같으면 비교
                int honorMin = Collections.min(honor);
                if (honorMin < newScore){
                    //새로운 스코어가 기존 명예의 전당에것들보다 큰가?
                    //크다면 최소값 지우고 새로 들어간다.
                    honor.remove(honor.indexOf(honorMin));
                    honor.add(newScore);
                }
            }else{
                //적다면 그냥 바로 삽입
                honor.add(newScore);
            }
            answer[i] = Collections.min(honor);
        }
        //return 하는거는 명예의 전당에서 제일 낮은놈
        return answer;
    }
}
