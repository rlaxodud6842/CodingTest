import java.util.Scanner;

//https://www.acmicpc.net/problem/2438

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            while (sc.hasNextLine()){
                int repeat = sc.nextInt();
                for(int i = 1; i<repeat+1;i++){
                    System.out.println(getStar(i));
                }
            }
        }catch (Exception e){
        }
    }
    public static String getStar(int repeat){
        String star = "";
        for(int i = 0; i<repeat;i++){
            star += "*";
        }
        return star;
    }
}