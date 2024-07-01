import java.util.Stack;
//스텍에 get,indexOf가 있는줄 몰랐다.
class Solution {
    public int solution(int[] ingredient) {        
        int answer = 0;
        Stack<Integer> ingredientStack = new Stack();
        for (int element : ingredient){
            ingredientStack.push(element);
            if (ingredientStack.size() >= 4){
                if(ingredientStack.get(ingredientStack.size() - 4) == 1
                &&
                ingredientStack.get(ingredientStack.size() - 3) == 2
                &&
                ingredientStack.get(ingredientStack.size() - 2) == 3
                &&
                ingredientStack.get(ingredientStack.size() - 1) == 1){
                    answer++;
                    ingredientStack.pop();
                    ingredientStack.pop();
                    ingredientStack.pop();
                    ingredientStack.pop();
                }
            }
        }
        return answer;
    }
}