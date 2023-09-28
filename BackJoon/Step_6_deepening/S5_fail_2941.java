import java.io.*;
import java.util.Stack;

// https://www.acmicpc.net/problem/2941
public class Main {

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        int answer = solve(sentence);
        System.out.println(answer);
    }
    public static int solve(String sentence){
        Stack<Character> stack = new Stack<>();
        int counter = 0;

        for(int i = 0; i <sentence.length(); i++){
            char currentElement = sentence.charAt(i);
            if( currentElement == '=' && !stack.isEmpty() ){   // =인지 판별하는 if문 등장 -> 검문관
                if(stack.peek() == 'c'|| stack.peek() == 's'){ //c냐 s냐 는 그냥 판별
                    counter +=1;
                    stack.pop(); // 빼고, 현재 원소는 넣지 않으니까 뺄 필요도 x

                    counter += stack.size();
                    stack.clear();
                }else if(stack.peek() == 'z'){ //앞에놈 z냐?
                    stack.pop(); //z 들어올리고
                    if(!stack.isEmpty() && stack.peek() == 'd'){
                        counter +=1;
                        stack.pop();
                    }else{ //만약 앞에놈이 d가 아니면, 이미 pop 해놨기 때문에 그냥 카운터만 올리기.
                        counter +=1;
                    }
                    counter += stack.size();
                    stack.clear();
                }
            }else if (!stack.isEmpty() &&currentElement == 'j' ){// j인지 판별하는 if문 등장 -> 검문관
                if(stack.peek() == 'l'|| stack.peek() == 'n'){
                    counter +=1;
                    stack.pop(); // 빼고, 현재 원소는 넣지 않으니까 뺄 필요도 x

                    counter += stack.size();
                    stack.clear();

                }
            }else if (currentElement== '-' && !stack.isEmpty() ){// j인지 판별하는 if문 등장 -> 검문관
                if(stack.peek() == 'c'|| stack.peek() == 'd'){
                    counter +=1;
                    stack.pop(); // 빼고, 현재 원소는 넣지 않으니까 뺄 필요도 x
                    counter += stack.size();
                    stack.clear();
                }
            }
            else{
                stack.push(currentElement);
            }
        }
        counter += stack.size();

        return counter;
    }
}