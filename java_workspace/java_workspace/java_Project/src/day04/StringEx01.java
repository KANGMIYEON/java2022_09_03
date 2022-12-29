package day04;

import java.util.Scanner;

public class StringEx01 {

	public static void main(String[] args) {
		/*
		 * 5개의 파일명이 주어졌을 때, 검색하고자 하는 단어를 입력하면
		 * 해당 단어를 포함하는 파일을 출력
		 * */
		
		String[] fileName = {"java의 정석.txt", "String메서드.jpg", "이것이자바다.png",
				"이것이java다.jpg", "String의 정석.png"};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 단어를 입력해주세요.");
		String str = scan.next();
			int cnt=0;
				
			// 향상된 for문	
			for(String tmpFile : fileName) {
				if(tmpFile.contains(str)) { // 있다면 true
					cnt++;
					System.out.println(tmpFile);
					
				}
			}
			if(cnt == 0) {
				 System.out.println("찾을 수 없습니다. 다시 입력하세요.");
			}
		
			// 일반 for문
//			for(int i=0; i<fileName.length; i++) {
//				if(fileName[i].contains(str)) {
//				System.out.println(fileName[i]);
//				} else {}
//				System.out.println("찾을 수 없습니다. 다시 입력하세요.");
//			}
			
			scan.close();
	}

}
