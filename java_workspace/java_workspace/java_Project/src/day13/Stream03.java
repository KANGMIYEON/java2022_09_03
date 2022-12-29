package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream03 {

	public static void main(String[] args) {
		 List<Student> list = new ArrayList<>();
		 list.add(new Student("홍길동",90));
		 list.add(new Student("강감찬",95));
		 list.add(new Student("이순신",100));
		 
		 List<Student> list2 = Arrays.asList( // Array를 List 형태로 담아주는 것
				 new Student("신사임당",96),
				 new Student("퀴리부인",80),
				 new Student("세종대왕",100)
		 );
		 
		 Stream<Student> s = list.stream(); // list2로만 바꿔주면 됨
		 s.forEach(a->{
			 String name = a.getName();
			 int score = a.getScore();
			 System.out.println(name+":"+score);
		 });
		 Stream<Student> s1 = list.stream();
		 long cnt = s1.count(); // count는 long 형식
		 System.out.println(cnt+"명");

	}

}
