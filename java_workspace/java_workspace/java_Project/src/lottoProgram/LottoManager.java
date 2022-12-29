package lottoProgram;

import java.util.Scanner;

public class LottoManager implements Program{
	
	private Lotto[] lo = new Lotto[7];
	

	@Override
	public void createLotto(Scanner scan) {
		System.out.println("로또번호를 수동으로 입력해주세요.");
		for(int i=0; i<lo.length-1; i++) {
			int num = scan.nextInt();
		}
	}
	@Override
	public void createLottoAuto() {
		System.out.println("로또번호를 자동으로 생성합니다.");
		for(int i=0; i<lo.length-1; i++) {
//			lo[i] = random();
		}
	}
	@Override
	public void insertLottoRandom(Scanner scan) {
		System.out.println("당첨번호 입니다.");
		for(int i=0; i<lo.length; i++) {
//			lo[i] = 
//			System.out.print(lo[i]+" ");
		}
		
	}
	@Override
	public void checkLotto() {
		System.out.println();
		
	}
	@Override
	public void printLotto() {
		for(int i=0; i<lo.length; i++) {
			System.out.print(lo[i]+" ");
		}
		
	}
	
	public void printMain() {
		System.out.println("-----Lotto-----");
		System.out.println("1. 로또 번호 생성 (수동)");
		System.out.println("2. 로또 번호 생성 (자동)");
		System.out.println("3. 당첨 번호 생성");
		System.out.println("4. 당첨 번호 확인");
		System.out.println("5. 역대 당첨 번호 리스트");
		System.out.println("6. 종료");
		System.out.println("----------------");
	}
	
	// 번호를 랜덤으로 생성하는 메서드
	public int random() {
		return (int)(Math.random()*45)+1;
	}
	// 같은 값이 있는지 확인하는 메서드
	public static boolean isContain(int arr[], int num) {
		for(int tmp : arr) {
			if(tmp == num) {
				return true;
			}
		} 
		return false;
	
	}
}
