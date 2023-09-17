import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/12906
public class Solution {
    public int[] solution(int []arr) {
            Stack<Integer> numberStack = new Stack<Integer>();
            for(int i : arr){
                if(numberStack.empty()){
                    numberStack.push(i);
                }else if(numberStack.peek()== i)
                    continue;
                else if(numberStack.peek() != i){
                    numberStack.push(i);
                }
            }
            int[] answer = new int[numberStack.size()];
            int answerIndex = 0;
            for(int i:numberStack){
                answer[answerIndex] = i;
                answerIndex++;
            }

            return answer;
        }
}