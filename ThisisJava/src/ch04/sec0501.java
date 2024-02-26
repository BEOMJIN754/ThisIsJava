package ch04;

import java.util.Scanner;

public class sec0501 {

	public static void main(String[] args) {

		int speed = 0 ; 
		boolean boo = true ; 
		
		Scanner sc = new Scanner(System.in) ; 
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("1.증속 || 2.감소 || 3.중지");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("선택하세요.");
		String str = sc.nextLine();
		
		
		while(boo) {
			if(str.equals("1")) {
				speed++ ; 
				System.out.println(speed + "만큼 증가하였습니다.");
			}
			else if(str.equals("2")) {
				speed-- ; 
				System.out.println(speed + "만큼 감소하였습니다.");
			}
			else if(str.equals("3")) {
				boo = false ; 
				System.out.println("프로그램이 종료되었습니다.");
			}
		}
		
		
	}

}
