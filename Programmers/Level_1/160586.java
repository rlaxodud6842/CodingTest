import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/160586

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> keypad = new HashMap<>();
        for (int i = 0; i < keymap.length; i++){
            for (int j = 0; j < keymap[i].length(); j++){
                char cur = keymap[i].charAt(j);            
                if(keypad.containsKey(cur)){
                    //있다면
                    int min = keypad.get(cur);
                    keypad.put(cur,Math.min(j+1,min));
                }else{
                    //없다면
                    keypad.put(cur,j+1);
                }
            }
        }
        
    
        for (int i = 0; i < targets.length; i++){
            int sum = 0;
            for (int j = 0; j < targets[i].length(); j++){
                //targets 돌면서 키패드의 숫자를 담았다가 리턴
                //만약 키패드에 없으면 -1 리턴
                char curTarget = targets[i].charAt(j);
                if (keypad.containsKey(curTarget)){
                    //이녀석이 있다면
                    sum += keypad.get(curTarget);
                }else{
                    //없다면
                    sum = -1;
                    break;
                }
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}