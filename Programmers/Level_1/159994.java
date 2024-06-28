import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue<String> cardsQueue1 = new LinkedList<>();
        Queue<String> cardsQueue2 = new LinkedList<>();
        
        for (String card1 : cards1){
            cardsQueue1.add(card1);
        }
        for (String card2 : cards2){
            cardsQueue2.add(card2);
        }
        
        for (int i = 0; i < goal.length; i++){
            if (goal[i].equals(cardsQueue1.peek())){
                cardsQueue1.poll();
                continue;
            }else if(goal[i].equals(cardsQueue2.peek())){
                cardsQueue2.poll();
            }else{
                answer = "No";
                return answer;
            }
        }
        return answer;
    }
}