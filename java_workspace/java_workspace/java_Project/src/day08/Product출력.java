package day08;

import java.util.Scanner;

public class Product출력 {

	public static void main(String[] args) {
		/* 앞에서 만든 Product class를 이용하여 상품을 등록 / 출력
		 * 상품을 등록하시겠습니까? (y/n) y
		 * 상품명 : 가방
		 * 가격 : 20,000
		 * 상품을 등록하시겠습니까? (y/n) y
		 * 상품명 : 신발
		 * 가격 : 30,000
		 * 상품을 등록하시겠습니까? (y/n) n
		 * 
		 * 출력
		 * 상품리스트
		 * 1. 가방 : 20,000원
		 * 2. 신발 : 30,000원
		 * 
		 */
		
		Product pr[] = new Product[10];
		
		
		Scanner sc = new Scanner(System.in);
		char menu = 'y';
		int cnt=0; // 배열의 번지
		
		while(menu !='n') {
			System.out.println("상품을 등록하시겠습니까? (y/n)");
			menu = sc.next().charAt(0);
			
			if(menu == 'y') {
				System.out.println("상품명 : ");
				String name = sc.next();
				System.out.println("가격 : ");
				int price = sc.nextInt();
				pr[cnt] = new Product(name, price);
				cnt++;
			} else if(menu !='n'){
				System.out.println("y/n만 입력 가능합니다.");
			}
		}
		
		System.out.println("-----등록된 제품 리스트-----");
		for(int i=0; i<cnt; i++) {
			System.out.println((i+1)+". "+pr[i]); // toString이 자동으로 반영됨
		}
		
		
		
		
		
//			int cnt=0;
//		
//			for(int i=0; i<pr.length; i++) {
//				System.out.println("상품을 등록하시겠습니까? (y/n)");
//				String str = sc.next();
//			if(str.equals("y")) {
//				System.out.println("상품명 : ");
//				String name = sc.next();
//				System.out.println("가격 : ");
//				int price = sc.nextInt();
//				pr[i] = new Product(name, price);
//				cnt++;
//			} else if(str.equals("n")) {
//				System.out.println("상품 등록을 마칩니다.");
//				break;
//			} else {
//				System.out.println("잘못된 입력입니다.");
//			}
//			}
//		
//			System.out.println("--------상품리스트--------");
//			
//			for(int i=0; i<cnt; i++) {
//				System.out.println(pr[i]);
//			}
	}
	


		
}












