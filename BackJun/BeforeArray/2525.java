import java.util.Scanner;

public class Main {
    static class Alam{
        private int hourCounter;
        public Alam(int A,int B,int t){
            int calcedMinute = calcMinute(B,t);
            int calcedHour = calcHour(A,getHourCounter());
            showTime(calcedHour,calcedMinute);
        }

        public int getHourCounter() {
            return hourCounter;
        }
        public void showTime(int hour, int minute){
            System.out.println(hour+" "+minute);
        }

        public int calcMinute(int minute, int time){
            hourCounter = 0;

            int endtime = minute + time;

            if (endtime > 60){
                while(endtime>59){
                    endtime -= 60;
                    hourCounter++;
                }
                return endtime;
            }else if(endtime == 60){
                endtime = 0;
                hourCounter++;
                return endtime;
            }
            return endtime;
        }
        public int calcHour(int hour,int counter){
            if (counter > 1){
                hour += counter;
                if (hour >24){
                    hour = hour%24;
                }
            }else if (counter == 1){
                if (++hour ==24){
                    hour = 0;
                }
            }

            if (hour == 24){
                hour = 0;
            }
            return hour;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()){
            String time = sc.nextLine();
            String timer = sc.nextLine();
            String[] times = time.split(" ");

            int A = Integer.parseInt(times[0]);
            int B = Integer.parseInt(times[1]);

            int t = Integer.parseInt(timer);

            Alam a1 = new Alam(A, B, t);


        }
    }
}