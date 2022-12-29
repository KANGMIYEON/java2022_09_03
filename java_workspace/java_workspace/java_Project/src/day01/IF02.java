package day01;

public class IF02 {

	public static void main(String[] args) {
		/*
		 * 국어, 영어, 수학 점수의 합계와 평균을 출력.
		 * 평균이 80이상이면 합격, 아니면 불합격
		 * */
		
		int kor = 77;
		int eng = 88;
		int math = 99;
		
		int sum = kor+eng+math;
		double avg = sum/3.0;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		
		if(avg >= 80) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}

}
