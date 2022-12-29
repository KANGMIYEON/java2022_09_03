package day03;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		/*
		 * 숫자를 입력받아 입력받은 숫자를 거꾸로 출력
		 * ex) 입력 : 11456 => 출력 : 65411 => 6+5+4+1+1
		 * ex) 입력 : 19463 => 출력 : 36491 => 3+6+4+9+1
		 * 각 자리의 합계 출력
		 * */
		Scanner scan = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		
		int num=scan.nextInt();
		int a=0, sum=0;
		while(num > 0) {
			a = num % 10;
			num = num / 10;
			sum = sum + a;
			System.out.print(a);
		} 
		
		System.out.println();
		System.out.println("--------------------");
		System.out.println(sum);
		
		
		
		
		
//		int sum=0;
//		System.out.println("숫자를 입력하세요.");
//		int num = scan.nextInt();
//		int a = (int)Math.log10(num)+1; // 자리수
//		System.out.printf("뒤집은 숫자는 : ");
//		
//		for(int i=0; i<a; i++) {
//			System.out.print(num%10);
//			sum+=num%10;
//			num=num/10;
//		}
//		
//		System.out.println();
//		System.out.printf("합계 : %d", sum);
		
		
		
		
//		int i;
//		int[] arr = new int[5];
//		
//		for(i=0; i<arr.length; i++) {
//			int num = scan.nextInt();
//			arr[i] = num;
//			System.out.println("입력: "+arr[i]);
//			
//			System.out.println(a); // 자리수
//			
//			}
			
		
			
			
			
			
			
	

	}

} 
