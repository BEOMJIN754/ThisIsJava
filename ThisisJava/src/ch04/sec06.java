package ch04;

import java.util.Scanner;

public class sec06 {

	public static void main(String[] args) {
		
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 졸료하려면 Q를 입력하세요");
		
		Scanner sc = new Scanner(System.in); 
		String str ; 
		
		do {
			System.out.print(">");
			str = sc.nextLine();
			
			System.out.println(str);
		}while(! str.equals("Q"));
		
		System.out.println( );
		System.out.println("프로그램 종료");
	}

}
