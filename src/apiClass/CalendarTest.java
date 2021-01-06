package apiClass;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// 현재 시스템의 날짜, 시간관련 정보 객체를 생성
		Calendar now = Calendar.getInstance();
		
		//System.out.println(now);
		//날짜를 변경하기
		now.set(2021, 4, 28);
		
		now.set(Calendar.YEAR, 2025);
		now.set(Calendar.MONTH, 1);
		now.set(Calendar.DAY_OF_MONTH, 1);
		
		// 2020년 12월 24일 오전 현재Date
		
		// Calendar 클래스 set 메소드의 경우 == 오버로딩(같은 메소드명이지만 매개변수가 여러개)
		
		int y = now.get(Calendar.YEAR);// == now.get(1); //now.YEAR == 틀림
		int m = now.get(Calendar.MONTH)+1;
		int d = now.get(Calendar.DAY_OF_MONTH);
		int h = now.get(Calendar.HOUR_OF_DAY);
		int min = now.get(Calendar.MINUTE);
	
		int wd = now.get(Calendar.DAY_OF_WEEK); // 요일 일1 월2 화 3 ~
		
		String weekStr = "";
		
		//INT 보다 작은 정수, char, string
		switch(wd) {
		case 1: weekStr = "일";
		break;
		case 2: weekStr = "월";
		break;
		case 3: weekStr = "화";
		break;
		case 4: weekStr = "수";
		break;
		case 5: weekStr = "목";
		break;
		case 6: weekStr = "금";
		break;
		case 7: weekStr = "토";
		break;
		}
		
		System.out.printf("%d년-%d월-%d일 %d:%d(%s)\n이제 게임을 시작하지\n",y,m,d,h,min,weekStr);
		
		
		int yearmax = now.getActualMaximum(Calendar.YEAR);
		int monthmax = now.getActualMaximum(Calendar.MONTH)+1;
		int daymax = now.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(yearmax);
		System.out.println(monthmax);
		System.out.println(daymax);
	}

}
