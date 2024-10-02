import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int count = 0;
	static int isfalindrome(String s,int l, int r){
		count++;
		if(l >= r){
			return 1;
		}else if (s.charAt(l) != s.charAt(r)){
			return 0;
		}else{
			return isfalindrome(s, l + 1, r - 1);
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++){
			String s = br.readLine();
			count = 0;
			System.out.println(isfalindrome(s,0,s.length() - 1) + " " + count);
		}
	}
}