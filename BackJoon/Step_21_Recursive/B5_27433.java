import java.util.*;

public class Main {
	static long factorial(long N){
		if (N == 0){
			return 1;
		}
		if(N == 1){
			return 1;
		}else{
			return N * factorial(N - 1);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(factorial(Integer.parseInt(sc.nextLine())));
		sc.close();
	}
}