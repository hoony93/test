package D2;

import java.util.Scanner;

public class n1926 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<= n ; i++) {
			int cnt =check(i);
			print(cnt, i);
		}
	}
	
	static int check(int num) {
		String str = num+"";
		int cnt=0;
		for(int j = 0 ; j< str.length();j++) {
			if(str.charAt(j) =='3' || str.charAt(j) =='6' || str.charAt(j) =='9') 
				cnt++;
		}
		return cnt;
	}
	
	static void print(int cnt , int num) {
		if(cnt ==0)
			System.out.print(num);
		else 
			for(int j =0; j<cnt; j++) 
				System.out.print("-");
		System.out.print(" ");
	}
}
