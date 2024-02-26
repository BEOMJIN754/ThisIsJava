package ch05;

public class sec08StrArray {

	public static void main(String[] args) {

		String[] strArray = new String[3] ; 
		
		strArray[0] = "Java" ; 
		strArray[1] = "Java" ; 
		strArray[2] = new String("Java") ; 
		
		if(strArray[0] == strArray[1]) {
			System.out.println("같은 객체를 참조합니다.");
		}
		
		
		if(strArray[1] == strArray[2]) {
			System.out.println("같은 객체를 참조합니다."); 
		}else {
			System.out.println("다른 객체를 참조합니다.");
		}
		
		
		if(strArray[1].equals(strArray[2])) {
			System.out.println("문자열이 같습니다.");
		}
	}

}
