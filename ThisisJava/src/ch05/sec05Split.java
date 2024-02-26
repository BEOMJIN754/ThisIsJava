package ch05;

import java.util.Scanner;

public class sec05Split {

	public static void main(String[] args) {

		System.out.println("좋아하는 색을 순서대로 네 가지 입력해주세요");
		Scanner scan = new Scanner(System.in) ; 
		String color = scan.nextLine() ; 
		
		String[] tokens = color.split(" ") ; 
		
		for(int i = 0 ; i<4 ; i++) {
			System.out.println(i + " 번쨰 "+ tokens[i]);
		}


	}

}
