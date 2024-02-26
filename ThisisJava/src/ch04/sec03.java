package ch04;

public class sec03 {

	public static void main(String[] args) {
		
		String grade = "B" ;
		
		int score = 0 ;
		switch(grade) {
			case "A": 
			 score = 100; 
			 break; 
			case "B": 
			 int result = 100-20 ; 
			 score = result ;
			 break;
		}
		System.out.println(score);	
			
		int num = (int) (Math.random()*6) +1 ;
		
		 switch(num) {
		  case 1:
			System.out.println("1번입니다.");
			break;
		  case 2:	
			System.out.println("2번입니다.");
			break;
		  case 3:	
		  System.out.println("3번입니다.");
		  	break;
		  case 4:
			System.out.println("4번입니다.");
			break;
		  case 5:	
			System.out.println("5번입니다.");
			break;
		  case 6:
			System.out.println("6번입니다.");
			break;
		 } 
		
	}	
}
