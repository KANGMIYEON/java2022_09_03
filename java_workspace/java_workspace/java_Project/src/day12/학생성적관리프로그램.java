package day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class 학생성적관리프로그램 {

	public static void main(String[] args) {
		/*
		 * map을 이용
		 * 한 학생의 성적을 관리하는 프로그램 작성
		 * Scanner는 멤버변수로 선언하고, 메서드에서 사용
		 * >> menu
		 * 1.성적추가 => insert(map)
		 * 2.성적조회(전체출력) => print(map) 합계, 평균
		 * 3.성적조회(과목) - 과목 서치 후 출력 => printSub(map) - scan
		 * 4.성적수정 => modify(map) - scan
		 * 5.종료
		 * 
		 * 출력예시
		 * 국어 100
		 * 
		 * 전체조회시에만 합계/평균 같이 출력
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> stu = new HashMap<>();
		
		int menu = -1;
		
		do {
			printMenu();
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: insert(stu, scan); break;
			case 2: print(stu); break;
			case 3: printSub(stu, scan); break;
			case 4: modify(stu, scan); break;
			case 5: break;
			default:
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
		}while(menu != 5);
		System.out.println("프로그램 종료!");
		scan.close();
		
		
		

	}
	
	public static void printMenu() {
		System.out.println("menu >> ");
		System.out.println("1.성적추가");
		System.out.println("2.성적조회(전체출력)");
		System.out.println("3.성적조회(과목)");
		System.out.println("4.성적수정");
		System.out.println("5.종료");
		System.out.println("menu를 선택해주세요 >>");
	}
	
		// 성적추가
		public static void insert(HashMap<String, Integer> stuGrade, Scanner scan) {
			// 1. 과목과 성적 입력받기 (성적이 0~100 범위를 벗어난다면 다시 입력)
			System.out.println("과목과 성적을 입력해주세요(ex 국어 90)");
			// scan.next() : 공백을 미포함
			// scan.nextLine() : 공백 포함. enter까지 다 받음.
			String subject = scan.next();
			int score = scan.nextInt();
			
			if(score<0 || score>100) {
				System.out.println("잘못된 점수입니다.");
				return; // return; : 메서드를 빠져나가는 구문, break; : 반복문을 빠져나가는 구문
			}
			// 2. map에 추가(과목이 존재한다면 추가불가, 없다면 추가) => 중복방지
			if(stuGrade.get(subject)==null) {
				stuGrade.put(subject, score);
			} else {
				System.out.println(subject+"는 이미 존재하는 과목입니다.");
			}
			
//			System.out.println("과목명을 입력하세요 >>");
//			String sub = scan.next();
//			System.out.println("점수를 입력하세요 >>");
//			Integer score = scan.nextInt();
//			stuGrade.put(sub, score);
//			System.out.println("해당 과목의 성적이 추가되었습니다.");
		}
		
		// 성적조회 (전체출력, 합계, 평균, 등급)
		public static void print(HashMap<String, Integer> stuGrade) {
			int sum = 0;
			Iterator<String> it = stuGrade.keySet().iterator();
			while(it.hasNext()) {
				String tmp = it.next();
				System.out.println(tmp+":"+stuGrade.get(tmp));
				sum += stuGrade.get(tmp);
			}
			double avg = (double)sum/stuGrade.size();
			
			System.out.println("합계:"+sum);
			System.out.printf("평균:%.2f\n",avg);
			if(avg>=90) {
				System.out.println("등급:A");
			} else if(avg>=80) {
				System.out.println("등급:B");
			} else if(avg>=70) {
				System.out.println("등급:C");
			} else if(avg>=60) {
				System.out.println("등급:D");
			} else {
				System.out.println("등급:F");
			}
			
		}
		
		// 성적조회 (과목을 입력해 출력) => printSub(map, scan)
		public static void printSub(HashMap<String, Integer> stuGrade, Scanner scan) {
			// 1. 과목 입력받기
			System.out.println("성적조회를 원하는 과목을 입력해주세요 >>");
			String subject = scan.next();
			// 2. 해당 과목의 성적을 가져옴
			Integer score = stuGrade.get(subject); // subject의 value
			// 3. 해당과목이 없다면 없다고 출력
			if(score == null) {
				System.out.println(subject+"는 없는 과목입니다.");
			} else {
				System.out.println(subject+":"+score);
			}
			
//			boolean flag = false;
//			System.out.println("성적조회를 원하는 과목을 입력해주세요 >>");
//			String searchSub = scan.next();
//			Set<String> set = stuGrade.keySet();
//			for(String tmp : set) {
//				if(tmp.equals(searchSub)) {
//					System.out.println(tmp+":"+stuGrade.get(tmp));
//					flag = true;
//				}
//			}
//			if(flag == false) {
//				System.out.println("등록된 과목이 아닙니다.");
//			}
		}
		
		// 성적수정
		public static void modify(HashMap<String, Integer> stuGrade, Scanner scan) {
			// 1. 과목과 성적 입력받기 (성적이 0~100 범위를 벗어난다면 다시 입력)
			System.out.println("과목과 성적을 입력해주세요(ex 국어 90)");
			// scan.next() : 공백을 미포함
			// scan.nextLine() : 공백 포함. enter까지 다 받음.
			String subject = scan.next();
			int score = scan.nextInt();
			
			if(score<0 || score>100) {
				System.out.println("잘못된 점수입니다.");
				return; // return; : 메서드를 빠져나가는 구문, break; : 반복문을 빠져나가는 구문
			}
			// 2. map에 추가(과목이 존재한다면 추가불가, 없다면 추가) => 중복방지
			if(stuGrade.get(subject)==null) {
				System.out.println(subject+"는 이미 존재하는 과목입니다.");
			} else {
				stuGrade.put(subject, score);
				System.out.println(subject+" 성적이"+score+"로 변경되었습니다.");
			}
			
			
//			boolean flag = false;
//			System.out.println("수정하려는 과목을 입력해주세요 >>");
//			String str = scan.next();
//			Set<String> set = stuGrade.keySet();
//			for(String tmp : set) {
//				if(tmp.equals(str)) {
//					System.out.println("수정할 성적을 입력해주세요 >>");
//					int score = scan.nextInt();
//					stuGrade.put(str, score);
//					flag = true; // if문이 잘 돌아갔다!
//				}
//			}
//			if(flag == false) { // tmp.equals(str) 같은게 없다~!
//				System.out.println("등록된 과목이 아닙니다.");
//			}
			
			
		}

}
