package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class List02 {

	public static void main(String[] args) {
		/*
		 * ---메뉴판---
		 * 1.햄버거 : 15000
		 * 2.피자 : 20000
		 * 3.음료 : 2000
		 * 4.과자 : 1000
		 * 5.사탕 : 500
		 * 6.프로그램종료
		 * 
		 * 메뉴를 선택해주세요. 1 수량을 입력해주세요. 1
		 * 햄버거 1개 : 15000원
		 * 메뉴를 선택해주세요. 2 수량을 입력해주세요. 2
		 * 피자 2개 : 40000원
		 * 
		 * 주문을 끝내시려면 0을 눌러주세요.
		 * 
		 * list1 메뉴
		 * list2 금액
		 * 
		 * printMenu
		 * 
		 * do~while로 작성
		 * while(menu != 0)
		 * 
		 * while문 종료 후
		 * 주문하신 금액은 55000 원 입니다.
		 * */
		
		Scanner scan = new Scanner(System.in);
		FoodManager fm = new FoodManager();
		fm.add(); // 값 추가하는 add 호출
		int menu=-1, count=0;
		
		do { 
			fm.printMenu();
			System.out.println();
			System.out.println("주문하실 메뉴와 수량을 입력해주세요.");
			System.out.println("※ 주문을 끝내시려면 0을 눌러주세요. ※");
			 menu= scan.nextInt();
			 if(menu<0 || menu>6) {
				 System.out.println("잘못 입력하셨습니다.");
			 }
			 count = scan.nextInt();
			 if(count<0) {
				 System.out.println("잘못 입력하셨습니다.");
			 }
			
			switch(menu) {
			case 1: fm.sale(0, count); break;
			case 2: fm.sale(1, count); break;
			case 3: fm.sale(2, count); break;
			case 4: fm.sale(3, count); break;
			case 5: fm.sale(4, count); break;
			case 0: break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}while(menu != 0);
		System.out.println("주문하신 총 금액은 " + fm.getTotSum() + "원 입니다.");
		
		scan.close();
		
	}

}

class FoodManager{
	// 멤버변수
	// 메뉴에 대한 List<String> , 가격 List<Integer>
	// subSum, totalSum
	
	private ArrayList<String> list1 = new ArrayList<String>();
	private ArrayList<Integer> list2 = new ArrayList<Integer>();
	private int totSum;
	
	public void printMenu() {
		System.out.println();
		System.out.println("---- ★ 메뉴판 ★ ----");
		System.out.println("1.햄버거: 15,000원");
		System.out.println("2.피자: 20,000원");
		System.out.println("3.음료: 2,000원");
		System.out.println("4.과자: 1,000원");
		System.out.println("5.사탕: 500원");
		System.out.println("0.주문종료");
	}
	
	public void add() {
		// list에서 값 추가
		list1.add("햄버거");
		list2.add(15000);
		list1.add("피자");
		list2.add(20000);
		list1.add("음료");
		list2.add(2000);
		list1.add("과자");
		list2.add(1000);
		list1.add("사탕");
		list2.add(500);
				
	}
	
	public void sale(int menu, int count) {
		int sum=0; 
		System.out.print(list1.get(menu)+" ");
		System.out.print(count+"개 / ");
		sum = list2.get(menu)*count;
		System.out.println("합계 : "+sum+"원");
		totSum += sum;
		
	}

	public int getTotSum() {
		return totSum;
	}
	
	
	
}
