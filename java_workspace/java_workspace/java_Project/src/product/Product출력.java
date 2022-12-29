package product;

import java.util.Scanner;

public class Product출력 {

	public static void main(String[] args) {
	
		// do~while 사용
		
		
		/* Class Manager
		 * >> menu
		 * 1.제품추가(메뉴추가) => void add()
		 * 2.제품리스트보기(메뉴판 출력) => void printProduct()
		 * 3.제품주문(제품명,수량) => void orderPick(String name, int count)
		 * 4.주문내역(주문리스트 출력) - 지불할 총 금액 계산 =>  void printOrder()
		 * 5.프로그램 종료
		 * */
		
		/* 메뉴를 등록하시겠습니까? (y/n) y
		 * 상품명: 피자
		 * 가격: 15000
		 * 상품명: 햄버거
		 * 가격: 10000
		 * 
		 * 제품주문(String menu, int count)
		 * 햄버거 5
		 * list에서 해당 햄버거를 찾아 price를 가져와서 수량을 곱해서 order에 price로 저장
		 * 
		 * */
		
		ProManager pm = new ProManager();
		Scanner scan = new Scanner(System.in);
		
		int menu = -1;
		do {
			pm.printMenu(); // 화면에 대한 출력
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: pm.add(scan); break;
			case 2: pm.printProduct(); break;
			case 3:
				System.out.println("주문 메뉴명: ");
				String name = scan.next();
				System.out.println("주문 수량: ");
				int count = scan.nextInt();
				pm.orderPick(name, count);
				break;
			case 4: pm.printOrder(); break;
			case 5: break;
			default: System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
		} while(menu != 5);
		System.out.println("프로그램 종료!");
		scan.close();

	}

}


