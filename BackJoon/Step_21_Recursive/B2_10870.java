import java.util.*;

public class Main {
	static int fib(int N){
		if (N == 0){
			return 0;
		}
		if (N == 1){
			return 1;
		}
		return fib(N - 1) + fib(N - 2);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(fib(Integer.parseInt(sc.nextLine())));
		sc.close();
	}
}