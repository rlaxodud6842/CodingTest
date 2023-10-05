import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

<<<<<<< Updated upstream
// https://www.acmicpc.net/problem/2444
public class Main {
=======
public class Main{
    public static void main(String[] args) throws Exception{
        try{int x,y;
>>>>>>> Stashed changes

            Scanner sc = new Scanner(System.in);
            StringTokenizer st = new StringTokenizer(sc.nextLine());

            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            StringBuilder sb = new StringBuilder();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int[][] arr1 = new int[x][y];
            for (int i = 0; i<x; i++){
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                for(int t = 0; t<y; t++){
                    arr1[i][t] = Integer.parseInt(st1.nextToken());
                }
            }
<<<<<<< Updated upstream
        }
        sc.close();
    }
}
=======
            int[][] arr2 = new int[x][y];
            for (int i = 0; i<x; i++){
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                for(int t = 0; t<y; t++){
                    arr2[i][t] = Integer.parseInt(st2.nextToken());
                }
            }
            for (int i = 0; i<x; i++){
                for(int t = 0; t<y; t++){
                    sb.append(arr1[i][t]+arr2[i][t]);
                    if(t != 3){
                        sb.append(" ");
                    }

                }
                sb.append("\n");
            }
            System.out.println(sb);
        }catch(Exception e){

        }}
}
>>>>>>> Stashed changes
