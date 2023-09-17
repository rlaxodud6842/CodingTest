import java.util.Scanner;

//https://www.acmicpc.net/problem/2439

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            while (sc.hasNextLine()){
                int repeat = sc.nextInt();
                for (int i = 1; i<repeat+1; i++){
                    System.out.println(getStar(repeat,i));
                }
            }
        }catch (Exception e){}
    }
    public static String getStar(int repeat, int starCounter){
        String star = "";
        int nullCounter = repeat - starCounter;
        for (int i = 0; i<nullCounter; i++){
            star += " ";
        }
        for (int j = 0; j <starCounter; j++){
            star += "*";
        }
        return star;
    }
}