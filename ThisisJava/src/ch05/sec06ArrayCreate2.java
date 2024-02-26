package ch05;

public class sec06ArrayCreate2 {

	public static void main(String[] args) {

	int[] scores ; 
	
	scores = new int[] { 81, 84, 90	} ; 
	
	int sum1 = 0 ; 
	for(int i =0 ; i<scores.length ; i++) {
		sum1 += scores[i] ; 
	}
	System.out.println("총합은" + sum1+ "입니다.");
	
	printItem (new int[] {81, 84, 90}) ; 
	
	}

	public static void printItem( int[] scores) {
		for(int i=0; i<scores.length; i++) {
			System.out.println("score " + scores[i]);
		}
	}
}
