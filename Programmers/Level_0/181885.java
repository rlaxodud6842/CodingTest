import java.util.ArrayList;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> tempAnswer = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++){
            if (finished[i] != true){
                tempAnswer.add(todo_list[i]);
            }
        }
        String[] answer = new String[tempAnswer.size()];
        for (int i = 0; i < tempAnswer.size(); i++){
            answer[i] = tempAnswer.get(i);
        }
        return answer;
    }
}