package ch04;

public class sec07 {

	public static void main(String[] args) {
		
		outter: for(char upper = 'A'; upper<='Z'; upper++) {
			for(char lower = 'a'; lower<= 'z'; lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break outter;
				}
			}
		}
	}

}
