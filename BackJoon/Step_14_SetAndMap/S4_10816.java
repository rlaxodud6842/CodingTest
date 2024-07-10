import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> cards = new HashMap<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++){
            int newNumber = Integer.parseInt(st.nextToken());
            if (cards.size() == 0){
                cards.put(newNumber,1);  
            }else{
                //키포인트
                int preValue = cards.getOrDefault(newNumber,0);
                cards.put(newNumber,preValue + 1);
            }
        }
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++){
            int answer = cards.getOrDefault(Integer.parseInt(st.nextToken()),0);
            sb.append(answer + " ");
        }
        System.out.println(sb.toString());
    }
}