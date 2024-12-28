import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;
            
            // Equilateral :  세 변의 길이가 모두 같은 경우
            // Isosceles : 두 변의 길이만 같은 경우
            // Scalene : 세 변의 길이가 모두 다른 경우
            //0 0 0 을 받으면 그만.
            int[] arr = new int[3];

            while(true){
                st = new StringTokenizer(br.readLine());
                arr[0] = Integer.parseInt(st.nextToken());
                arr[1] = Integer.parseInt(st.nextToken());
                arr[2] = Integer.parseInt(st.nextToken());

                if(arr[0] == 0 && arr[1] == 0 && arr[2] ==0){
                    break;
                }

                Arrays.sort(arr);

                //3개 다 같을때
                if(arr[2] >= arr[0] + arr[1]){
                    System.out.println("Invalid");
                }else if (arr[0] == arr[1] && arr[1] == arr[2]){
                    //다 같을때
                    System.out.println("Equilateral");
                }else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]){
                    //두개만 맞을때
                    System.out.println("Isosceles");
                }else{
                    System.out.println("Scalene");    
                }
                
            }
            

    }
}