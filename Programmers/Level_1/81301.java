import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        HashMap<String, Integer> table = new HashMap<String, Integer>();
        table.put("zero",0);
        table.put("one",1);
        table.put("two",2);
        table.put("three",3);
        table.put("four",4);
        table.put("five",5);
        table.put("six",6);
        table.put("seven",7);
        table.put("eight",8);
        table.put("nine",9);
        
        StringBuilder answerSb = new StringBuilder();
        
        StringBuilder testSb = new StringBuilder();`
        for (char x : s.toCharArray()){
            if (Character.isDigit(x)){
                answerSb.append(x);         
            }else{
                testSb.append(x);
                String number = testSb.toString();
                if(table.containsKey(number)){
                    answerSb.append(table.get(number));
                    testSb = new StringBuilder();
                }
            }
        }
                   answer = Integer.parseInt(answerSb.toString());
        return answer;
        
        //하나씩 받아서 3개일때 one, two six?
        //하나씩 받아서 4개일때 zero,four,five,nine
        //하나씩 받아서 5개일때 three,seven,eight
        
        
    }
}