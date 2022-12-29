package day09;

public class Exception05 {

	public static void main(String[] args) {
		// 받은 배열 출력. try~catch문 활용하여 예외 잡기. 메세지는 get.Messege 사용.
		
		int arr[];
		int max = 10, min=1, size=5;
		int arr2[] = null;
		
		try {
//			arr = createRandomArray(size, min, max);
//			for(int i=0; i<arr.length; i++) {
//				System.out.print(arr[i]+" ");
//			}
//			for(int i : createRandomArry(size, min, max) ) // 향상된 for문
//				System.out.println(i);
			createRandomArray2(arr2, min, max); 
			for(int i=0; i<arr2.length; i++) {
				System.out.print(arr2[i]+" ");
			}
			
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	/*
	 * 기능 : 배열의 길이(size)가 주어지면 길이만큼 배열을 생성해서 값을 돌려주는 메서드
	 * 값은 랜덤으로 생성해서 반환 (max, min)
	 * 매개변수 : size, max, min
	 * 리턴타입 : 배열[]
	 * 메서드명 : createRandomArry
	 * size의 값이 0보다 작다면 예외발생 => "배열의 길이가 0보다 작습니다."
	 * */
	
	public static int[] createRandomArray(int size, int min, int max) {
		
		if(size < 0) {
			throw new RuntimeException("배열의 길이가 0보다 작습니다.");
		}
		int tmp[] = new int[size];
		for(int i=0; i<tmp.length; i++) {
			tmp[i] = (int)(Math.random()*(max-min+1))+min;
		}
		return tmp;
	}
	
	/*
	 * 배열이 주어지면, 주어진 배열에 랜덤값을 채우는 메서드
	 * 매개변수 : 배열, max, min
	 * 리턴타입 : void
	 * 메서드명 : createRandomArray2
	 * 배열이 null이거나, 배열의 길이가 0보다 작을경우 예외 
	 * */
	
	public static void createRandomArray2(int arr[], int min, int max) {
	
		if (arr == null) {
			throw new NullPointerException("배열이 null입니다.");
		}
		if( arr.length == 0) {
			throw new RuntimeException("배열의 길이가 0입니다.");
		}
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(max-min+1))+min;
		}
			
	}
}
