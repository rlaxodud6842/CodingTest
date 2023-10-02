import java.util.Scanner;

public class main {
    public static void main (String[] argv){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.nextLine());

        String[] star = new String[N];

        int repeat = 2*N-1;
        for(int i = 1; i<repeat; i++){
            StringBuilder sb1 = new StringBuilder();5

                int nullCounter = N - i;
                int starCounter = 2*i -1;

                while(nullCounter != 0){
                    sb1.append(" ");
                    nullCounter--;
                }
                while(starCounter != 0){
                    sb1.append("*");
                    starCounter--;
                }
                
                System.out.println(String.valueOf(sb1));
        }
        sc.close();
    }
}

