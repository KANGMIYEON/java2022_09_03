package day09;

import java.time.LocalDate;

public class LocalDateEx01 {

	public static void main(String[] args) {
		/*
		 * 1.8 이전에는 Date 사용했으나 현재는 deprecated(비권장)
		 * 1.8 이후에는 Calendar, LocalDate, LocalTime, LocalDateTime 사용을 권장
		 * */
		
		LocalDate today = LocalDate.now();
		LocalDate date = LocalDate.of(2009, 9, 30);

		System.out.println(date);
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.getMonthValue());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfYear()); // 올해가 며칠 됐는지
		System.out.println(today.minusYears(1L)); // 오늘 날짜 기준 - 1년 전
		System.out.println(today.plusMonths(2L)); // 오늘 날짜 기준 - 두달 후

	}

}
