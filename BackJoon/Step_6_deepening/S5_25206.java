import java.util.HashMap;
import java.util.Scanner;

// https://www.acmicpc.net/problem/25206
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double reputation = 0;
        double totalReputation = 0;

        HashMap<String,Double> grade = new HashMap<>();
        grade.put("A+",4.5);
        grade.put("A0",4.0);
        grade.put("B+",3.5);
        grade.put("B0",3.0);
        grade.put("C+",2.5);
        grade.put("C0",2.0);
        grade.put("D+",1.5);
        grade.put("D0",1.0);
        grade.put("F",0.0);
        grade.put("P",0.0);

        for (int i = 0; i < 20; i++){
            double[] temp = check(sc.nextLine(),grade);
            reputation += temp[0];
            totalReputation += temp[1];
        }
        double answer = reputation / toㄴtalReputation;

        System.out.println(answer);
    }
    public static double[] check(String sentence,HashMap<String,Double> gradeMap){
        String[] parsedSentence = sentence.split(" "); //공백으로 쪼개고
        double[] grade = new double[2]; //학점 * 평가 알파벳을 [0], 학점을 [1]에 담기위해 배열 생성

        if (!parsedSentence[2].equals("P")){ //P면 아에 둘다 0으로 하게 만들기
            grade[0] = Double.parseDouble(parsedSentence[1]) * gradeMap.get(parsedSentence[2]); //파싱된 문장에 [1]은 학점,[2]는 알파벳이니 [2]는 맵으로 알맞는 학점 가져오기.
            grade[1] = Double.parseDouble(parsedSentence[1]);
        }else{
            grade[0] = 0;
            grade[1] = 0;
        }
        return grade;
    }
}