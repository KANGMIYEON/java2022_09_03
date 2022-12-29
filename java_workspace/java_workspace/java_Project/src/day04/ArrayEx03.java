package day04;

public class ArrayEx03 {

	public static void main(String[] args) {
		/*
		 * 1~10까지 배열에 저장하고 출력
		 * 
		 * */
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
		
		/*
		 * 10개의 size의 배열을 생성하고, 1~20사이의 랜덤 수를 입력 받은 후 출력
		 * */
		
		System.out.println();
		int[] arr1 = new int[10];
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = (int)(Math.random()*20)+1;
			System.out.print(arr1[i]+" ");
		}
		
		/*
		 * 랜덤수의 배열을 오름차순 정렬 후 출력
		 * */
		System.out.println();
		System.out.println("----정렬 후 출력----");
		for(int i=0; i<arr1.length; i++) {
			for(int j=i; j<arr1.length; j++) {
				if(arr1[i] > arr1[j]) {
				int tmp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = tmp;
				}
			} 
			
		}
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		// 배열 탐색(출력) - 향상된 for문 : 간략하게 출력할 수 있음
		System.out.println();
		System.out.println("----정렬 후 출력----");
		for(int tmp : arr1) {
			System.out.print(tmp+" ");
		}

	}

} 
