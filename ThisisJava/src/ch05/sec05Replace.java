package ch05;

import java.util.Scanner;

public class sec05Replace {

	public static void main(String[] args) {

		String oldStr = "자바 문자열은 불변이며, String 입니다." ; 
		String newStr = oldStr.replace("불변", "immutable"); 
		
		System.out.println(oldStr);
		System.out.println(newStr); 
		
		System.out.println("주민증록번호를 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		String ssn = scan.nextLine();
		
		String firstNum = ssn.substring(0,6) ; 
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(6) ; 
		System.out.println(secondNum);
		
		
	}

}
