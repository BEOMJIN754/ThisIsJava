package ch04;

import java.util.Scanner;

public class sec01 {

	public static void main(String[] args) {

		System.out.println("점수를 입력하십시오");
		
		Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    
	    int score = Integer.parseInt(str); 
	    
	    if(score>=90) {
	    	System.out.println("A");
	    }
	    else if(score>=80) {
	    	System.out.println("B");	
	    }
	    else if(score>=70) {
	    	System.out.println("C");
	    }
	    else if(score>=60) {
	    	System.out.println("D");
	    }
	    else {
	    	System.out.println("F");
	    }
	}

}
