package ch05;

public class sec09ArrayCopy {

	public static void main(String[] args) {
		
		int[] oldIntArr = {78, 89, 85} ; 
		
		int[] newIntArr = new int[5] ; 
		
		for(int i=0 ; i<oldIntArr.length ; i++ ) {
			newIntArr[i] = oldIntArr[i] ; 
		}
		
		for(int i=0 ; i<newIntArr.length; i++) {
			System.out.print(newIntArr[i] + ",");
		}
		
		String[] oldStrArr = {"모자", "신발", "바지"} ; 
		
		String[] newStrArr = new String[4] ; 
		
		for(int i=0 ; i<oldStrArr.length ; i++ ) {
			newStrArr[i] = oldStrArr[i] ; 
		}
		
		System.out.println(" ");
		
		
		for(int i=0 ; i<newStrArr.length; i++) {
				System.out.print(newStrArr[i] + ",");
		
		}

	}

}
