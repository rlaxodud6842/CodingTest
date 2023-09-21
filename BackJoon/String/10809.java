import java.util.HashMap;
import java.util.Scanner;

// https://www.acmicpc.net/problem/10809
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            HashMap<Character,Integer> indexMap = new HashMap<>();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i<26; i++){
                char alpahbet = (char)(97+i);
                indexMap.put(alpahbet,-1);
            }
            String sentence = sc.nextLine();
            for (int i = 0; i <sentence.length() ; i++){
                char index = sentence.charAt(i);

                if(indexMap.get(index) == -1){
                    indexMap.put(index,i);
                }
            }

            for(int i = 0; i<26; i++){
                char alpahbet = (char)(97+i);
                sb.append(indexMap.get(alpahbet)+" ");
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb);


        }catch (Exception e){
        }
    }
}