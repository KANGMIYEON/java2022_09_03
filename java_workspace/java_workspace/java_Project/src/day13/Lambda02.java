package day13;

import java.util.HashMap;

public class Lambda02 {

	public static void main(String[] args) {
		/*
		 * map을 구성해서 forEach를 이용한 출력
		 * Lambda 형태로 출력
		 * 	number.forEach((k)->{
		 * 		System.out.print(n+" ");
		 * 	});
		 * */
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("미연", 28);
		map.put("시헌", 27);
		map.put("지원", 28);
		map.put("성민", 30);
		
		map.forEach((a,b)->{
			System.out.println("name:"+a+" age:"+b);
		});
		
		Number max = (x,y)->(x>=y)?x:y;
		System.out.println(max.getMax(100, 20));
		
		
//		Number add1 = (x,y)->x+y;
//		System.out.println(add1.add(5, 6));
		
	
		
	}
	
@FunctionalInterface
interface Number{
	 int getMax(int num1, int num2);
	 // 리턴 => int, 매개변수 => int로 2개
	 // 람다식의 함수형 인터페이스는 반드시 메서드가 하나! 아니면 람다식을 구현할 수 없음
	 //int add(int a, int b);
}
	

}
