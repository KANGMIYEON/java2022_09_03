package bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class AccountManager {

	ArrayList<Account> list = new ArrayList<>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int cnt = 0;

	public void printMenu() {
		System.out.println("------menu------");
		System.out.println("1.계좌생성");
		System.out.println("2.계좌목록");
		System.out.println("3.예금");
		System.out.println("4.출금");
		System.out.println("5.종료");
		System.out.println("menu를 선택하세요 >>");
	}

	// 계좌생성
	public void createAccount() throws IOException {
		String accountNum = "Bank-" + String.format(new DecimalFormat("0000").format(++cnt));
		System.out.println("예금주명을 입력해주세요 >>");
		String owner = br.readLine();
		System.out.println("입금하실 금액을 입력해주세요 >>");
		int balance = Integer.parseInt(br.readLine());
		Account ac = new Account(accountNum, owner, balance);
		list.add(ac);
	}

	// 계좌목록
	public void accountList() {
		for (Account tmp : list) {
			System.out.println(tmp);
		}
	}

	// 예금
	public void deposit() throws IOException {
		System.out.println("입금을 원하는 예금주명을 입력해주세요 >>");
		String name = br.readLine();
		boolean flag = false;
		for (Account tmp : list) {
			if (tmp.getOwner().equals(name)) {
				System.out.println("입금하실 금액을 입력해주세요 >>");
				int input = Integer.parseInt(br.readLine());
				tmp.setBalance(tmp.getBalance() + input);
				System.out.println("남은 잔액은 " + tmp.getBalance() + " 원 입니다.");
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("존재하지 않는 예금주입니다.");
		}

	}

	// 출금
	public void withdraw() throws IOException {
		System.out.println("출금을 원하는 예금주명을 입력해주세요 >>");
		String name = br.readLine();
		boolean flag = false;
		for (Account tmp : list) {
			if (tmp.getOwner().equals(name)) {
				System.out.println("출금하실 금액을 입력해주세요 >>");
				int output = Integer.parseInt(br.readLine());
				if (tmp.getBalance() - output < 0) {
					System.out.println("잔액이 부족합니다.");
				} else {
					tmp.setBalance(tmp.getBalance() - output);
					flag = true;
				}
				System.out.println("남은 잔액은 " + tmp.getBalance() + " 원 입니다.");
			}
		}
		if (flag == false) {
			System.out.println("존재하지 않는 예금주입니다.");
		}
	}
}
