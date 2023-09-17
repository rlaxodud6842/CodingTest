import java.util.Scanner;

// https://www.acmicpc.net/problem/10807
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            while (sc.hasNextLine()){
                int countSize = sc.nextInt();
                sc.nextLine();
                String[] countArray = sc.nextLine().split(" ");
                String targetNumber = sc.nextLine();
                int answer = 0;
                if (countSize == countArray.length){
                    for(String i :countArray){
                        if (i.equals(targetNumber)){
                            answer += 1;
                        }
                    }
                    System.out.println(answer);
                }
            }
        }catch (Exception e){
        }
    }
}