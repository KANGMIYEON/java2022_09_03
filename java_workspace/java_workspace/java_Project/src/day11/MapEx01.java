package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx01 {

	public static void main(String[] args) {
		// 과목과 점수를 입력받아 출력하고, 합계, 평균 출력
		// 종료 키워드가 나올 때까지 반복 : "종료"
		
		Scanner scan = new Scanner(System.in);
		
		HashMap<String, Integer> map = new HashMap<>();
		
		String subject=" ";
		Integer score=0;
		int sum = 0;
		
		do {
			System.out.println("------ 과목과 점수를 입력해주세요 ------");
			System.out.println("※ 종료를 원하시면 <종료>라고 입력해주세요 ※");
			subject = scan.next();
			if(subject.equals("종료")) { // subject를 받았을 때 종료 할 거니까 이 위치에!
				break;
			}
			score = scan.nextInt();
			map.put(subject, score);
		
		} while(!subject.equals("종료"));
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				System.out.println(key+":"+map.get(key));
				sum += map.get(key);
			}
			System.out.println("합계:"+sum);
			System.out.printf("평균:%.2f",(double)sum/map.size());
			
		
	
	}

}
