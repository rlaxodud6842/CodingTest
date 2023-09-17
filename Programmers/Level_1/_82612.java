package Level_1;

// https://school.programmers.co.kr/learn/courses/30/lessons/82612
class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        // 가격이 count가 올라갈수록 count * price 만큼 되는거임.
        long totalPrice = 0;
        long lossPrice;
        for (long i = 1;i < count+1; i++){
            totalPrice += i * price;
        }
        lossPrice = totalPrice - money;
        answer = lossPrice;

        if (answer < 0){
            return 0;
        }else{
            return answer;
        }
    }
}
