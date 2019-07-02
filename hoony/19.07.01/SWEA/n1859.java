package D2;

import java.util.Scanner;

public class n1859 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int [] price = new int[n];
			
			for (int i = 0; i < n; i++) {
				price[i] = sc.nextInt();
			}
			long totalMoney = 0 ; 
			int buy = 0;
			int buyMoney = 0 ;
			int maxPrice = 0;
			
			for(int i=n-1; i>=0 ; i--) {
				if(maxPrice <= price[i]) {
					
					totalMoney += buy * maxPrice;
					totalMoney -= buyMoney;
					buyMoney = 0 ;
					buy=0;
					maxPrice = price[i];
					//System.out.println("max:"+maxPrice + "totalMoney : "+totalMoney);
				}else {
					buy++;
					buyMoney +=price[i];
				}
			}
			if(buy !=0) {
				totalMoney += buy * maxPrice;
				totalMoney -= buyMoney;
			}
			
			System.out.println("#"+test_case+" "+totalMoney);
		}
	}

}
