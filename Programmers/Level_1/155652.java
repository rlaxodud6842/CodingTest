class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            char code = s.charAt(i);
            char testCode = code;
            int sumIndex = index;
            

            for (int j = 0; j < index; j++){
                testCode++;
                while (true){
                    if (testCode >= 123){
                    testCode -= 26;
                }
                if(skip.contains(String.valueOf(testCode))){
                    testCode++;
                    }else{
                        break;
                    }
                }
                
            }
            
            sb.append(testCode);
        }
        answer = sb.toString();
        return answer;
    }
}