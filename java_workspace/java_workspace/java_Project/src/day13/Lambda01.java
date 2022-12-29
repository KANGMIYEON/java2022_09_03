package day13;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Lambda01 {

	public static void main(String[] args) {
		/*
		 * 람다식 (Lambda)
		 * 함수의 구현과 호출만으로 프로그래밍이 수행되는 방식
		 * 외부자료 부수적인 영향(side effect)을 주지 않도록 구현하는 방식
		 * 
		 * 매개변수가 하나인 경우 자료형과 중괄호{}를 생략할 수 있음.
		 * 실행문이 하나면 중괄호{} 생략가능
		 * return이 있으면 중괄호{} 생략 불가
		 * 
		 * str -> System.out.println(str);
		 * (int x, int y) -> {return x+y};
		 * int x -> {return x}; 
		 * int x, int y -> {return x+y}; => error.
		 * (int x, int y) -> return x+y; => error.
		 * */
		
		// ArrayList 10,20,30,40,50을 입력 후 출력
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<=5; i++) {
			list.add(i*10);
		}
		
		for(Integer tmp : list) {
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		System.out.println("----------------");
		
		// Lambda 형태로 출력 
		list.forEach((n)->{
			System.out.print(n+" ");
		}); // number의 변수로 사용할 n
		
		System.out.println();
		System.out.println("----------------");
		
		// 메서드 직접 참조 => ::
		System.out.println("메서드 직접 참조");
		list.forEach(System.out::println);
		System.out.println("----------------");
		
		// Consumer 매개변수가 1개인 함수형 인터페이스
		Consumer<Integer> method =
				(n)->{System.out.print(n+" ");}; // 중괄호{} 안에서도 ; 입력해줘야 함
				
		list.forEach(method);
		
		System.out.println();
		System.out.println("----------------");
		
		//BiConsumer 매개변수가 2개인 함수형 인터페이스
		BiConsumer<String, Integer> bis = (a,b)->{
			System.out.println("name:"+a+", age:"+b); // 중괄호{} 생략가능
		};
		bis.accept("짱구", 6);
	}

}
