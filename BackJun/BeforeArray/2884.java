import java.util.Scanner;

public class Main {
    static class Alam{
        public int hour;
        public int minute;
        public boolean isMinuteCalced = false;
        public final int chang = 45;
        public Alam(int h,int m){
            this.minute = m;
            this.hour = h;

            calcMinute();
            calcHour();
        }

        public void calcMinute(){
            int changTime = minute - chang;

            if (changTime < 0){
                minute = Math.abs(Math.abs(minute - chang) - 60);
                isMinuteCalced = true;
            }else if (minute - chang == 0){
                minute = 0;
                isMinuteCalced = false;
            }
            else if (changTime > 0){
                minute = Math.abs(changTime);
                isMinuteCalced = false;
            }

        }
        public void calcHour(){
            if (isMinuteCalced){
                if (hour == 0){
                    hour = 24;
                }
                --this.hour;
            }
            isMinuteCalced = false;
        }

        public int getChangHour(){
            return hour;
        }
        public int getChangMinute(){
            return minute;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()){
            String time = sc.nextLine();
            String[] times = time.split(" ");

            int h = Integer.parseInt(times[0]);
            int m = Integer.parseInt(times[1]);

            Alam a1 = new Alam(h, m);


            System.out.printf("%d %d",a1.getChangHour(),a1.getChangMinute());
        }
    }
}