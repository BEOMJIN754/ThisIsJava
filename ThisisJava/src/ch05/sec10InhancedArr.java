package ch05;

public class sec10InhancedArr {

	public static void main(String[] args) {

		int[] arr = {78, 85, 87, 84} ; 
		
		int sum = 0;
		for(int arr1 : arr) {
		
			sum = sum+ arr1; 	
		}
		  System.out.println("모든 점수의 총 합 " + sum);
		
		
	}

}
