
public class threesix {

	public static void main(String[] args) {
		int a = 1 ; 
		if(a==1) {
			System.out.println("zomvoid");
					}
		String str = "zomvoid" ; 
		if(str.equals("zomvoid")) {
			System.out.println("gogo");
		}
		int car = 'a' ; 
		System.out.println(car);
		
		int car1 = 'A'; 
		if((65<=car1) && (car1<=90)) {
			System.out.println("대문자이군요");
		}
		int car2 = '3';
		if((48<=car2)&&(car2<=57)) {
			System.out.println("숫자입니다");
		}
		int soo = 16545 ; 
		if((soo%3 == 0)||(soo%5 == 0)) {
			System.out.println("3 또는 5의 배수군요");
		}
		int w = 0 ; 
		w += 10;
		System.out.println(w);
		w -= 5;
		System.out.println(w);
		w *= 3;
		System.out.println(w);
		w /= 5;
		System.out.println(w);
		w &= 5; 
		System.out.println(w);
		
		int sco = 12 ; 
		char grade = (sco >15) ? 'A' :((sco>10)? 'B' : 'C');
		System.out.println(grade);
	}

}
