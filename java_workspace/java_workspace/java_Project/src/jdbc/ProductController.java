package jdbc;

import java.util.List;
import java.util.Scanner;

public class ProductController {
	
	// controller : manager 역할
	// 메서드명 update, delete 를 다른 단어로 대체해서 사용하는 것이 좋음
	// 상품등록, 상품리스트보기, 상품상세페이지보기, 상품수정, 상품삭제
	// 데이터베이스 연동한 후 컨트롤러에서 모든 메뉴를 분기처리
	// 서비스는 컨트롤러가 호출, DAO는 서비스가 호출
	private Scanner scan;
	private Service svc; // 인터페이스로 생성
	private boolean flag; // 종료 변수 (false가 되면 종료)
	
	public ProductController() {
		scan = new Scanner(System.in);
		svc = new ProductService(); // service 구현(implement) 객체 => 클래스 생성
		flag = true;
		printMenu();
	}

	private void printMenu() {
		while(flag) {
			System.out.println("-----상품관리시스템-----");
			System.out.println("1.등록 2.목록 3.찾기 4.수정 5.삭제 Etc.종료");
			System.out.println("메뉴를 선택해주세요 >>");
			int menu = scan.nextInt();
			
			switch(menu) {
				case 1:
					System.out.println("등록메뉴");
					// 실행 메서드를 등록
					register();
					break;
				case 2:
					System.out.println("list메뉴");
					// 실행 메서드를 등록
					list();
					break;
				case 3:
					System.out.println("detail메뉴");
					// 실행 메서드를 등록
					detail();
					break;
				case 4:
					System.out.println("edit메뉴");
					// 실행 메서드를 등록
					edit();
					break;
				case 5:
					System.out.println("remove메뉴");
					// 실행 메서드를 등록
					remove();
					break;
				default:
					flag = false;
					break;
		
			}
		}
		
	}

	// 등록
	private void register() {
		System.out.println("상품입력 >>");
		String pname = scan.next();
		System.out.println("상품가격 >>");
		int price = scan.nextInt();
		System.out.println("제조사 >>");
		String madeby = scan.next();
		// Service야 register라는 메서드로 DAO한테 전달해줘~
		int isOk = svc.register(new Product(pname, price, madeby));
		System.out.println("상품등록 : " + (isOk > 0 ? "성공" : "실패"));
		
	}
	
	private void list() {
		// select 구문 * all
		List<Product> list = svc.list();
		// 출력
		for(Product p : list) {
			System.out.println(p);
		}
		
	}
	
	private void detail() {
		// select 내가 선택한 번호의 전체 내용 리턴
		System.out.println("상품번호 >>");
		int pno = scan.nextInt();
		Product pvo = svc.detail(pno); // pno에 해당하는 객체 pvo 가져다줘~
		System.out.println(pvo);
		
	}
	
	private void edit() {
		// 상품번호, 이름, 가격, 제조사 입력받아서 매개변수로 보냄
		// 리턴 잘 됐는지 체크 isOk
		System.out.println("변경할 상품번호 >>");
		int pno = scan.nextInt();
		System.out.println("상품이름 >>");
		String pname = scan.next();
		System.out.println("상품가격 >>");
		int price = scan.nextInt();
		System.out.println("제조사 >>");
		String madeby = scan.next();
		int isOk = svc.edit(new Product(pno, pname, price, madeby));
		System.out.println("상품수정 : " + (isOk > 0 ? "성공" : "실패"));
		
	}

	private void remove() {
		// 상품번호를 입력받아 삭제
		System.out.println("삭제할 상품번호 >>");
		int pno = scan.nextInt();
		int isOk = svc.remove(pno);
		System.out.println("상품삭제 : " + (isOk > 0 ? "성공" : "실패"));
	}
	
	

}
