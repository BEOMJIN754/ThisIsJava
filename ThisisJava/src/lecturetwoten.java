import java.util.Scanner;

public class lecturetwoten {

	public static void main(String[] args) {

		byte one = Byte.parseByte("1");
		int two = Integer.parseInt("33");
		double three = Double.parseDouble("3.1415");
		System.out.println(one+two+three);
		
		String m = String.valueOf("10");
		System.out.println(m);
		
		System.out.print("오곡");
		System.out.println("오고곡");
		System.out.printf("이름: %s\n","이범진" );
		System.out.printf("번호: %f\n",3.14);
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str);
		String strr = scan.nextLine();
		System.out.println(strr);
		String result = str + strr ; 
		System.out.println(result);
		
		String strx = scan.nextLine();
		int x = Integer.parseInt(strx);
		String stry = scan.nextLine();
		int y = Integer.parseInt(stry);
		
		int resultt = x+y ; 
		System.out.println(resultt);
		
		while(true) {
			String stra = scan.nextLine();
			int a = Integer.parseInt(stra);
			String strb = scan.nextLine();
			int b = Integer.parseInt(strb);
			
			int resulttt = a+b ; 
			System.out.println(resulttt);
		}
		
		
	}

}
