package ch02;

public class VariableUseEwample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 12 ; 
		int day = 365 ; 
		System.out.println(month + "개월이라는 시간");
		System.out.println(day + "일동안 나는 무엇을 일구었을까");
		
		int x = 24 ; 
		int y = 31 ;
		System.out.println(x + "시간" + y + "일");
		
		int temp = x ; 
		 x = y;
		 y = temp;
		System.out.println(x + "일" + y + "시간");
		// = 오른쪽의 값이 왼쪽으로 들어가는 것임 
	}

}
