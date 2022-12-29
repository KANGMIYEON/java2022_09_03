package day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Stream04 {

	public static void main(String[] args) {
		/*
		 * 여행사 상품이 있습니다. 여행 비용은 15세 이상은 100만원, 그 미만은 50만원 계산
		 * 고객 3명이 패키지 여행을 떠난다고 했을 때 비용 계산, Class 만들어서 list, 고객 명단 검색, 출력
		 * 고객에 대한 클래스를 생성하고 ArrayList로 고객을 관리 
		 * 
		 * 1. Class 생성 : 멤버변수선언, 생성자(all), getter/setter, toString()
		 * 고객정보
		 * CustomerLee
		 * 이름: 이순신, 나이: 40, 비용: 100
		 * CustomerKim
		 * 이름: 김유신, 나이: 20, 비용: 100
		 * CustomerHong
		 * 이름: 홍길동, 나이: 13, 비용: 50
		 * 
		 * customer 객체 3개 ArrayList에 담아서!
		 * 고객명단, 총 여행경비 합계 출력
		 * 20대 이상 고객명단 출력 => 이름 순으로 정렬하고 출력(comparator) or 익명클래스로 넣어서 출력 or comparable?
		 * 
		 * */
		
		Customer cuLee = new Customer("이순신",40);
		Customer cuKim = new Customer("김유신",20);
		Customer cuHong = new Customer("홍길동",13);
		
		ArrayList<Customer> list = new ArrayList<>();
		list.add(cuLee);
		list.add(cuKim);
		list.add(cuHong);
		
		int sum = 0;
		System.out.println("------고객명단------");
		for(Customer tmp : list){
			String name = tmp.getName();
			int age = tmp.getAge();
			int price = tmp.getPrice();
			sum += price; // 가격합계
			System.out.println("이름:"+name+", 나이:"+age+", 비용:"+price);
		}
		System.out.println("총 여행 경비: "+sum+"만원");
		
		
		System.out.println("--------------------");
		System.out.println("20대 이상 고객 명단");
		
		// 정렬
		Collections.sort(list);
		
		// 정렬
//		list.sort(new Comparator<Customer>() {
//
//			@Override
//			public int compare(Customer o1, Customer o2) {
//				// String : compareTo 1, -1, 0
//				// int : 작은수-큰수 = 음수 / 큰수-작은수 = 양수 / 0
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
		
		for(Customer tmp : list) {
			if(tmp.getAge()>=20) {
			System.out.println(tmp);
			}
		}
		System.out.println();
		
		// Stream을 이용한 방법
		System.out.println("==스트림을 이용한 방법==");
		list.stream().map(c->c.getName()) // 원하는 요소만 추출해서 출력
			.forEach(s->System.out.println(s));
		System.out.println("-----총비용-----");
		int tot = list.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총 여행 경비:"+tot);
		
		list.stream().filter(c->c.getAge()>=20).sorted().forEach(s->System.out.println(s));
		
		
		
		
		

	}

}


class Customer implements Comparable<Customer>{
	// 멤버변수 선언
	private String name;
	private int age;
	private int price;
	
	// 생성자
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		this.price = age>=15? 100: 50;
	}
	
	// getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	// toString
	@Override
	public String toString() {
		return "이름:" + name + ", 나이:" + age + ", 가격:" + price;
	}

	@Override
	public int compareTo(Customer o) {
		return this.name.compareTo(o.name);
	}
	
	
	
	
	
	
}