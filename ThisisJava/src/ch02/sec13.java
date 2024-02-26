package ch02;

import java.util.Scanner;

public class sec13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in)  ; 
		
		System.out.println("X값 입력");
		String strx = scan.nextLine() ;
		int x = Integer.parseInt(strx); 
		
		System.out.println("Y값 입력");
		String stry = scan.nextLine();
		int y = Integer.parseInt(stry) ; 
		
		int result = x + y ;
		System.out.println(result);
		
		while(true) {
			System.out.println("암거나 입력하세요");
			Scanner scann = new Scanner(System.in) ; 
			String stra = scann.nextLine();
			System.out.println(stra);
			if(stra.equals("q")) {
				break ; 
			}
		}
	}

}
