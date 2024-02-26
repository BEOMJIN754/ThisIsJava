package ch05;

public class sec06ArrayCreateByNew {

	public static void main(String[] args) {

		int[] arr1 = new int[2] ; 
		for(int i=0 ; i<2; i++) {
			System.out.println(arr1[i]);
		}

		arr1[0] = 56 ; 
		arr1[1] = 60 ; 
		
		for(int i=0 ; i<2; i++) {
			System.out.println(arr1[i]);
		}
		
		String[] arr2 = new String[2] ; 
		for(int i=0 ; i<2; i++) {
			System.out.println(arr2[i]);
		}
		
		arr2[0] = "더블 불고기 버거" ; 
		arr2[1] = "맥스파이시 상하이 치킨버거" ; 
	
		for(int i=0 ; i<2; i++) {
			System.out.println(arr2[i]);
		}
	
	}

}
