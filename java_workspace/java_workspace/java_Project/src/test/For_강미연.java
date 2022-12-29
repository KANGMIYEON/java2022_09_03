package test;

public class For_강미연 {

	public static void main(String[] args) {
		
		int[][] a = {{10,20,50,},{20,30,15},{100,110,120}};
		
		int sum = 0;
		int count = 0;
		
		for(int i=0; i<a.length; i++) {
			for(int k=0; k<a[i].length; k++) {
				sum += a[i][k];
				count++;
			}
		}
		System.out.println("합계: "+sum);
		

	}

}
