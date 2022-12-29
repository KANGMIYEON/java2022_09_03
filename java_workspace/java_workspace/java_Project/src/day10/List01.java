package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
// import java.util.*; : 전체 import

public class List01 {

	public static void main(String[] args) {
		/*
		 * 하루 일과를 저장하는 list를 생성 <String>
		 * 
		 * */
		ArrayList<String> list = new ArrayList<String>();
		list.add("기상");
		list.add("씻기");
		list.add("아침먹기");
		list.add("학원가기");
		list.add("공부하기");
		list.add("점심먹기");
		list.add("집에가기");
		
		System.out.println("♥ 하루 일과 ♥");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		System.out.println(list);
		
		// 0번지 요소 삭제
		list.remove(0);
		System.out.println(list);
		
		// list1 생성, 아침먹기, 공부하기
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("아침먹기");
		list1.add("공부하기");
		
		// 주어진 컬렉션의 값과 일치하는 값만 남기고 삭제
		list.retainAll(list1); 
		System.out.println(list);
		
		// 정렬하기
		list.sort(new Test()); // 방법1. 직접 구현 Test()
		Collections.sort(list); // 방법2.
		
		System.out.println();
		System.out.println("♥ 하루 일과 ♥");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp);
		}
		
	}

}

class Test implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
	
}
