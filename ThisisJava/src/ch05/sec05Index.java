package ch05;

import java.util.Scanner;

public class sec05Index {

	public static void main(String[] args) {

		String name = "장송의 프리렌"; 
		
		System.out.println("찾고자 하는 애니메이션 이름을 검색해주세요");
		Scanner scan = new Scanner(System.in) ; 
		String search = scan.nextLine();
		
		int index1 = search.indexOf("프리렌") ;
		int index2 = search.indexOf("장송의") ; 
		
		if(index1 == -1 && index2 == -1) {
			System.out.println("검색되지 않았습니다.");
		}else {
			System.out.println(name);
		}
		
		
		System.out.println("애니 이름 검색");
		Scanner scan2 = new Scanner(System.in) ; 
		String search2 = scan2.nextLine(); 
		
		boolean result = search2.contains("프리렌") ;
		boolean result2 = search2.contains("장송의") ;
		
		if(result) {
			System.out.println(name);
		}else if(result2) {
			System.out.println(name);
		}else {
			System.out.println("검색되지 않았습니다.");
		}
		
		
		
	}

}
