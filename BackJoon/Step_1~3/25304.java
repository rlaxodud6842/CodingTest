import java.util.Scanner;

//https://www.acmicpc.net/problem/25304

public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int totalsum = 0;

            int totalCost = sc.nextInt();
            sc.nextLine();
            int buySomethingSize = sc.nextInt();
            sc.nextLine();

            for(int j = 0; j<buySomethingSize;j++){
                String buySomething = sc.nextLine();
                totalsum += getSum(buySomething);
            }
            if(totalCost == totalsum){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }catch (Exception e){}
    }
    public static int getSum(String buySomething){
        int tempSum = 0;
        String[] temp = buySomething.split(" ");
        tempSum += Integer.parseInt(temp[0])*Integer.parseInt(temp[1]);
        return tempSum;
    }
}