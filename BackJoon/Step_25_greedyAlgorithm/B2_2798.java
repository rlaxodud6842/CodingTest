//https://www.acmicpc.net/problem/2798

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] card = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            card[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(card);

        int answer = 0;
        int temp = 0;

        for (int j = 0; j < N; j++){
            temp += card[j];
            for (int t = j + 1; t< N; t++){
                temp += card[t];
                for(int m = t+1; m<N; m++){
                    temp += card[m];
                    if (temp <= M && answer <= temp){
                        answer = temp;
                    }
                    temp -= card[m];
                }
                temp -= card[t];
            }
            temp -= card[j];
        }
        System.out.println(answer);
    }
}

//요구사항 분석


/*

N과 M을 받음
N개의 카드
1 2 3 4 5 => 조합해서 M에 가까운 수 만들어야함
한번 다 받아보고 비교

 * 
 */