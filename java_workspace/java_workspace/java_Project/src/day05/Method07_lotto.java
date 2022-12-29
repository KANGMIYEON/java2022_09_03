package day05;

public class Method07_lotto {

	public static void main(String[] args) {
		/*
		 * 로또번호 생성 (1~45 랜덤으로 번호를 생성)
		 * 당첨확인 
		 * */

		int lotto[] = new int[7]; // 당첨번호6 + 보너스번호1(마지막번호)
		int user[] = new int[6]; // 사용자번호
		
		randomArray(lotto);
		System.out.print("당첨번호 : ");
		printArray(lotto);

		System.out.println();
		
		randomArray(user);
		System.out.print("사용자번호 : ");
		printArray(user);
		
		System.out.println();
		
		int rank = lottoRank(lotto, user);
		if(rank == -1) {
			System.out.println("꽝~!! 다음 기회에");
		} else {
			System.out.println(rank + "등 당첨~!!");
		}
		
	}

	/* 
	 * 1. 번호를 랜덤으로 생성하는 기능(메서드)
	 * 1~45까지 랜덤 생성
	 * 
	 * 리턴타입 : int
	 * 매개변수 : X
	 * 메서드명 : random
	 * */
	
	public static int random() {
		return (int)(Math.random()*45)+1;
	} 
	
	
	/*
	 * 2. 배열에 1.의 랜덤번호를 저장하는 기능(메서드) // 7개
	 * 매개변수 : 배열 (int arr[])
	 * 리턴타입 : void
	 * 메서드명 : randomArray
	 * */
	
	public static void randomArray(int arr[]) {
		
		// for문 사용
		for(int i=0; i<arr.length; i++) {
			// arr[i] = random();
			int r = random();
			if(!isContain(arr, r)) {
				arr[i]= r;
				} else {
					i--; // 만약 값이 중복되면 당첨번호에 0이 출력됨
				}
		}
		
		// while문 사용 : 맞을 때만 index 값에 하나 채움
		int cnt = 0;
		while(cnt < arr.length) {
			int r = random();
			if(!isContain(arr, r)) {
				arr[cnt] = r;
				cnt++;
			}
		}
	} 
	
	/*
	 * 3. 정수 배열을 콘솔에 출력하는 기능(메서드)
	 * 매개변수 : int arr[]
	 * 리턴타입 : void
	 * 메서드명 : printArray
	 * */
	
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
	
	/*
	 * 4. 같은 값이 있는지 확인하는 기능(메서드)
	 * 매개변수 : 생성할 배열(int arr[]), num (random)
	 * 리턴타입 : boolean(true/false)
	 * 메서드명 : isContain
	 * */
	
	public static boolean isContain(int arr[], int num) {
		for(int tmp : arr) {
			if(tmp == num) {
				return true;
			}
		} 
		return false;
		
//		for(int i=0; i<arr.length; i++) {
//				if(num==arr[i]) {
//					return true;
//				}
//				
//			}
//		
//			return false;
		
	}
	
	/*
	 * 5. 등수를 알려주는 메서드
	 * 매개변수 : int lotto[], int user[]
	 * 리턴타입 : 1등~꽝
	 * 메서드명 : lottoRank
	 * -- 당첨기준
	 * 6개 일치 : 1등
	 * 5개 일치 + 보너스일치 : 2등
	 * 5개 일치 : 3등
	 * 4개 일치 : 4등
	 * 3개 일치 : 5등
	 * 나머지 : 꽝
	 * */
	
	public static int lottoRank(int lotto[], int user[]) {
		// lotto와 user는 개수가 다름.
		if(lotto.length <= user.length) { // 배열의 순서가 바뀌었거나, 같은 배열을 넣었거나
			return -1;
		}
		int cnt =0; // 맞춘 개수(보너스는 제외)
		for(int i=0; i<user.length; i++) {
			if(isContain(user, lotto[i])) { // 6개 까지만 체크!
				cnt++;
			}
		}
		
		switch(cnt) {
			case 6: return 1;
			case 5:
				if(isContain(user, lotto[lotto.length-1])) {
				return 2;
				} else {
				return 3;
				}
//				return isContain(user, lotto[lotto.length-1])? 2: 3;
			case 4: return 4;
			case 3: return 5;
			default: return -1;
		}
	}
	
}
