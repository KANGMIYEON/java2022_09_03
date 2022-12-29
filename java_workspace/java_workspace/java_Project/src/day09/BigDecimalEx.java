package day09;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalEx {

	public static void main(String[] args) {
		
		// BigDecimal 값을 초기화 하기 위해서는 문자열로 값을 넘겨줘야 함.
		BigDecimal bd = new BigDecimal("1000000.1234");
		BigDecimal bd2 = new BigDecimal("100");
//		System.out.println(bd);
		
		//사칙연산을 이용하여 연산이 불가능.
		// 더하기(add) 빼기(subtract) 곱하기(multiply) 나누기(divide) 나머지(remainder) 사용.
		System.out.println("+ > "+bd.add(bd2));
		System.out.println("- > "+bd.subtract(bd2));
		System.out.println("* > "+bd.multiply(bd2));
		System.out.println("/ > "+bd.divide(bd2)); // bd2가 0이면 ArithmeticException 발생
		System.out.println("% > "+bd.remainder(bd2));
		
		// 비교를 나타낼 때 compareTo : 1,0,-1의 형태로 출력
		System.out.println(bd.compareTo(bd2)); // 1 = 앞에 수가 더 크다
		System.out.println(bd2.compareTo(bd)); // -1 = 앞에 수가 더 작다
		System.out.println(bd.compareTo(bd)); //  0 = 같다
		
		BigInteger bi = new BigInteger("123456789");
		System.out.println(bi);
		
		// < BigInteger 형변환 >
		
		// int -> BigInteger
		BigInteger bi2 = BigInteger.valueOf(100000);
		System.out.println(bi2);
		
		// BigInteger -> int
		int int_bigNum = bi2.intValue();
		System.out.println(int_bigNum);
		
		// BigInteger -> long
		long long_bigNum = bi2.longValue();
		System.out.println(long_bigNum);
		
		// BigInteger -> String
		String string_bigNum = bi2.toString();
		System.out.println(string_bigNum);
	}

}
