package ch03;

import java.util.Scanner;

public class sec07 {

	public static void main(String[] args) {
		int charCode = 'A' ; 
		// int charCode = 'a' ;
		// int charCode = '8' ; 
		
		if ((65<=charCode) && (charCode<=90)) {
			System.out.println("대문자 입니다.");
		}
		
		if((97<=charCode) && (charCode<=122)) {
			System.out.println("소문자 입니다.");
		}
		
		if((48<=charCode) && (charCode<=57)) {
			System.out.println("0~9 사이의 숫자군요");
		}
		
		
		
		Scanner scan = new Scanner(System.in) ; 
		System.out.println("문자를 입력하세요");
		char input = scan.next().charAt(0);
		
		char charCode1 = input ; 
		
		if(('가'<= charCode1)&&(charCode1 <= '힣')) {
			System.out.println("한글입니다.");
		}
		else if(('A'<=charCode1) && (charCode1<='Z')){
			System.out.println("대문자입니다.");
		}
		else if(('a'<=charCode1) && (charCode1<'z')) {
			System.out.println("소문자 입니다.");
		}
		else if(('0'<=charCode1) && (charCode1<='9')) {
			System.out.println("숫자입니다.");
		}
		else{
			System.out.println("한글,영어,숫자가 아닙니다.");
		}
		
	}

}
