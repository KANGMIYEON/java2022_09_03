package day08;

import java.util.Scanner;

public class 확장자찾기 {

	public static void main(String[] args) {
		/*
		 * 5개 문자열 배열 생성한 후, 5개의 파일명을 입력받는 코드를 작성
		 * 입력받은 파일명 중 이미지 파일을 검색하여 출력하는 코드를 작성
		 * 이미지 형식 파일 (jpg, png, gif, jpeg)
		 * */
		
		String fileName[] = new String[5];
		String ext[] = {"jpg", "png", "gif", "jpeg"};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<fileName.length; i++) {
			System.out.println("파일명을 입력해주세요.");
			String input = sc.next();
			fileName[i] = input;
		} 
		
		for(int i=0; i<fileName.length; i++) {
			if(isContain(ext, fileName[i])) {
				System.out.println(fileName[i]+" ");
			}
		}
	}
	/*
	 * 기능 : 배열에서 찾는 문자열이 있는지 없는지 확인해서 알려주는 메서드 (있으면 true, 없으면 false)
	 * 매개변수 : 배열, 찾는 값
	 * 리턴타입 : boolean
	 * 메서드명 : isContain
	 * */
	

	
	public static boolean isContain(String arr[], String str) {
		for(String tmp : arr) {
			if(str.contains(tmp)) {
				return true;
			}
			
		} return false;
	}

}


