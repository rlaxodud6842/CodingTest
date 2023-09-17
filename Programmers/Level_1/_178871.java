package Level_1;


// https://school.programmers.co.kr/learn/courses/30/lessons/178871

import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String,Integer> playerHashMap = new HashMap<>();
        for (int i = 0; i< players.length; i++){
            playerHashMap.put(players[i],i);
        }

        for (String call : callings){
            int nowGrade = playerHashMap.get(call);
            if(nowGrade > 0){
                String temp = players[nowGrade-1];
                players[nowGrade-1] = players[nowGrade];
                players[nowGrade] = temp;

                playerHashMap.put(players[nowGrade - 1],nowGrade - 1);
                playerHashMap.put(players[nowGrade],nowGrade);
            }
        }

        return players;
    }
}
