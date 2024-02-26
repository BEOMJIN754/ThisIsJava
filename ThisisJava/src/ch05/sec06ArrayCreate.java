package ch05;

public class sec06ArrayCreate {

	public static void main(String[] args) {
		
		String[] season = {"spring", "summer", "fall", "winter"};
		System.out.println(season[3]);
		
		season[3] = "겨울" ; 
		System.out.println(season[3]);
		
		
		int[] scores = {85,71,95};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i] ; 
		}
		
		int avg = sum / scores.length ; 
		System.out.println(scores.length + "학생의 평균은 " + avg + "입니다.");
	}

}
