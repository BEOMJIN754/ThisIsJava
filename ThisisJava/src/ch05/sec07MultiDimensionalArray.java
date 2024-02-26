package ch05;

public class sec07MultiDimensionalArray {

	public static void main(String[] args) {

		int[][] arr = {
				{84, 56, 57},
				{89, 72, 45}
		};
		
		System.out.println("1차원 배열 길이 " + arr.length);
		System.out.println("2-1 배열 길이 " + arr[0].length);
		System.out.println("2-2 배열 길이 " + arr[1].length);
		
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		
		int classone = 0;
		for(int i=0 ; i<arr[0].length ; i++) {
			classone += arr[0][i] ; 
		}
		
		double oneavg = (double) classone / arr[0].length ; 
		System.out.println("첫 번쨰 반의 평균쓰는" + oneavg);
		
		int totalStudent = 0 ;
		int totalSum = 0 ;
		
		for(int i=0 ; i<arr.length ; i++) {
			totalStudent += arr[i].length ;
			for(int k=0 ; k<arr[i].length ; k++) {
				totalSum += arr[i][k] ; 
			}
		}
		double avg = (double) totalSum/totalStudent ; 
		System.out.println("전체 학생의 평균은 " + avg + "입니다."); 
		
	}

}
