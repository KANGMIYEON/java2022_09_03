package lotto;

import java.util.Scanner;

public class 로또프로그램 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		int arr[] = {1,5,7,9,4,6};
//		Lotto l = new Lotto();
//		l.insertNumber(arr);
//		System.out.println(l);
		
		LottoManager lm = new LottoManager();
		int menu = 0;
		do {
			lm.printMenu();
			menu= scan.nextInt();
			
			switch(menu) {
			case 1: lm.createLotto(scan); break;
			case 2: lm.createLottoAuto(); break;
			case 3: lm.insertLottoAuto(); break; // 자동 or 수동 불러와줘야 함
			case 4: lm.checkLotto(); break;
			case 5: lm.printLotto(); break;
			case 6: break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu != 6);
		System.out.println("프로그램 종료!");
		
		scan.close();

	}

}
