package bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankApp {
	/* 은행업무 프로그램
	 * 값을 입력받을 때 scanner는 제외 
	 * 메뉴 : 1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료
	 * 1. 계좌번호 자동 생성 "Bank-0001" 발행 순서에 따라 넘버링
	 * String tmp = "Bank-"+ String.format(new DecimalFormat("0000").format(증가변수));
	 * 
	 * 2. 계좌번호는 여러개 생성 가능
	 * 3. 하나의 계좌에 대해 입금/출금이 가능 
	 * 4. 입금/출금이 이루어지면 잔액(Account에서)이 변경
	 * 5. 잔액이 부족하면 출금시 잔액부족 출력
	 * 6. 생성되지 않은 계좌에 대한 입/출금 X
	 * 
	 * */
	
	public static void main(String[] args) throws IOException {
		
		AccountManager am = new AccountManager();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int menu = -1;
		do {
			am.printMenu();
			menu = Integer.parseInt(br.readLine());				
			switch(menu) {
			case 1: am.createAccount(); break;
			case 2: am.accountList(); break;
			case 3: am.deposit(); break;
			case 4: am.withdraw(); break;
			case 5: break;
			default:
				System.out.println("menu를 잘못 입력하셨습니다.");
			}
			
		} while(menu != 5);
		System.out.println("종료합니다.");
		
		
		
	}
	

}
