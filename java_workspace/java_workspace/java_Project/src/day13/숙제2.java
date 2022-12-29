package day13;

import java.util.Arrays;
import java.util.HashSet;

public class 숙제2 {

	public static void main(String[] args) {
		// int[] data = {5,6,4,2,3,1,1,2,2,4,4,6,6,7};
		// 배열의 중복을 제거하고 내림차순으로 출력
		
		// 1. stream 사용
		int[] data = {5,6,4,2,3,1,1,2,2,4,4,6,6,7};
		int[] res = Arrays.stream(data).distinct().sorted().toArray();
		for(int tmp : res) {
			System.out.print(tmp+" ");
		}
		
		// 2. set 사용
		HashSet<Integer> set = new HashSet<>();
		
		
		
	}

}
