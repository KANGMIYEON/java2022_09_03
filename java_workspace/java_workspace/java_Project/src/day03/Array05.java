package day03;

public class Array05 {

	public static void main(String[] args) {
		/*
		 * 5개짜리 배열에 랜덤으로 값을 저장한 후 출력
		 * 1~50 사이의 수로 생성
		 * 
		 * 합계, 평균, 최대값, 최소값
		 * */
		int[] arr = new int[5];
		
		
		int max, min=90; // min에 범위보다 큰 값을 넣어줌.
		max=arr[0];
		int sum = 0;
		double avg = 0;
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*50)+1;
			System.out.println(arr[i]);
		}
			
		
		// 배열 탐색
		for(int i=0; i<arr.length; i++) {
				sum = sum + arr[i];
			if(max < arr[i]) {
				max = arr[i];
			}
			
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		avg = (double)sum / arr.length;
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		

	}

}
