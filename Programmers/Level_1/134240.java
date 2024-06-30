import java.util.ArrayList;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> player1 = new ArrayList<>(); 
        ArrayList<Integer> player2 = new ArrayList<>();
        for (int i = 1; i < food.length; i++){
            int arrayFood = food[i] / 2;
            while (arrayFood > 0){
                player1.add(i); //1은 계속 뒤로가고
                player2.add(0,i); //2는 밀려나고
                arrayFood--;
            }
                //음식의 수를 몫나누기 연산을 한다. 그럼앞에 선수 1의 앞에 놓여지는 음식수 결정
                // 이후 선수 2의수도 같이해준다.
                // ArrayList로 삽입해주면 편할듯?
        }
        for (int playerFood : player1){
            sb.append(String.valueOf(playerFood));
        }
        sb.append("0");
        for (int playerFood : player2){
            sb.append(String.valueOf(playerFood));
        }
        answer = sb.toString();
        return answer;
    }
}