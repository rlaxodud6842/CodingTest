import java.util.Scanner;
//https://www.acmicpc.net/problem/1018

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();

        String[] board = new String[row];

        for (int i = 0; i < row; i++) board[i] = sc.nextLine();

        int sol = Integer.MAX_VALUE;
        for (int i = 0 ; i <= row - 8; i++){
            for (int j = 0; j <= col - 8; j++){
                int cursol = getSolution(i,j,board);
                if(sol > cursol) sol = cursol;
            }
        }
        System.out.println(sol);
        sc.close();

    }
    public static Integer getSolution(int startRow,int startCol,String board[]){
        String[] orgBoard = {"BWBWBWBW","WBWBWBWB"};
        int whiteSol = 0;
        for(int i = 0; i<8; i++){
            int row = startRow + i;
            for (int j = 0; j<8; j++){
                int col = startCol + j;
                if(board[row].charAt(col) != orgBoard[row % 2].charAt(j)) whiteSol++;
            }
        }
        return Math.min(whiteSol, 64-whiteSol);
    }

    
}

//출처: https://coding-grandpa.tistory.com/107 [개발자로 취직하기:티스토리]