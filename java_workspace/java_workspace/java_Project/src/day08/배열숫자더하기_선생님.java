package day08;

public class 배열숫자더하기_선생님 {

	public static void main(String[] args) {
		
		int[][] arr1 = {{1,2},{3,4}};
		int[][] arr2 = {{3,4},{5,6}};
		int[][] arr3 = solution(arr1, arr2);
		
		for (int i=0; i<arr3.length; i++) { // 행
			for (int j=0; j<arr3[0].length; j++) { // 열
				System.out.print(arr3[i][j]+" ");
			}	
			System.out.println();
		}
		
		
	}
	
	/*
	 * 두 배열(2차원) => 행,열 크기가 같은 두 배열
	 * 이 두 배열의 같은 행, 같은 열의 값을 더해서 새로운 배열을 생성
	 * 매개변수 : 2차원 배열 arr1, arr2
	 * 리턴타입 : 2차원 배열
	 * 메서드명 : solution
	 * ex) arr1 = [[1,2],[3,4]] arr2 = [[3,4],[5,6]] => [[4,6],[8,10]]
	 * ex) arr1 = [[1],[2]] arr2 = [[3],[4]] => [[4],[6]]
	 * */
	
	public static int[][] solution(int arr1[][], int arr2[][]){
		int[][] res = new int[arr1.length][arr1[0].length];
		
		for (int i=0; i<arr1.length; i++) { // 행
			for (int j=0; j<arr1[0].length; j++) { // 열
				res[i][j] = arr1[i][j] + arr2[i][j];
			}	
		}
		return res;
	}

}
