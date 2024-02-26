package ch04;

public class sec04 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0 ;
		
		for( i =0 ; i<=100; i++) {
			 sum += i ;
		}
		System.out.println("1~"+i+"까지의 합"+sum);
		System.out.println();
		
		for(int m = 2 ; m<=9; m++ ) {
			System.out.println("***"+m+"단***");
			for(int n = 1; n<=9; n++) {
				System.out.println(m+"X"+n+"="+(m*n));
			}
		}
	}

}
