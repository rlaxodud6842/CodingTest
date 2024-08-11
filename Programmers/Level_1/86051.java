import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] numArr = new int[10];
        for(int i = 0; i < numArr.length; i++){
            numArr[i] = i;
        }
        
        Arrays.sort(numbers);
        for(int j =0; j < numArr.length; j++){
            for(int i = 0; i < numbers.length;i++){
                if(numbers[i] == numArr[j]){
                    numArr[j] = 0;
                    continue;
                }
            }
        }
        
        for(int num : numArr){
            answer += num;
        }
        
        
        return answer;
    }
}