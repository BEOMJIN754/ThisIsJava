package ch05;

import java.util.Scanner;

public class sec05Switch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in) ; 
		System.out.println("주민번호 13자리를 - 없이 입력해주세요.");
		
		String ssn = scan.nextLine();
		
		char sex = ssn.charAt(6);
		
		switch(sex) {
		 case '1' :
		 case '3' : 
			 System.out.println("남자입니다");
			 break;
		 case '2' : 
		 case '4' : 
			 System.out.println("여자입니다");
			 break ; 
		}
		
	    Scanner scan1 = new Scanner(System.in) ; 
	    System.out.println("핸드폰 번호를 11자리로 입력해주세요");
	    
	    String phNum = scan1.nextLine(); 
	    int length = phNum.length();
	    
	    if(length == 11) {
	    	System.out.println("11자리가 맞습니다.");
	    }
	    else {
	    	System.out.println("잘못 입력하셨습니다.");
	    }
	}

	

}
