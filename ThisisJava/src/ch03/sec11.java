package ch03;

import java.util.Scanner;

public class sec11 {

	public static void main(String[] args) {
		int score = 59 ; 
		char grade = (score > 90) ? 'A' : ((score > 80)? 'B' : 'C') ;
		
		System.out.println("이범진씨의 등급은" + grade + "점입니다.");
		
		while(true) {
			
			System.out.println("점수를 입력해 주세요");
			Scanner sc = new Scanner(System.in) ; 
			String str = sc.nextLine();
		
			int score1 = Integer.parseInt(str) ; 
			char grade1 = (score1>90) ? 'A' : ((score1>80)? 'B':'C');
		
			System.out.println("위 학생의 등급은" + grade1 + "입니다.");
			
		}
	}

}
