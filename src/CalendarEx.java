import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;

public class CalendarEx {

	public static void main(String[] args) {
		/*
		// 무엇이 필요한가 분석?
		// 1. 콘솔로 입력 2. 
		
		Scanner scan = new Scanner(System.in);
		Calendar Date = Calendar.getInstance();
		
		int in, in2;
		System.out.print("연도 입력?");
		in = scan.nextInt();
		
		System.out.print("월 입력?");
		in2 = scan.nextInt();
		
		Date.set(Calendar.YEAR,in);
		Date.set(Calendar.MONTH,in2-1);
		
		int y = Date.get(Calendar.YEAR);// == now.get(1); //now.YEAR == 틀림
		int m = Date.get(Calendar.MONTH)+1;
		int d = Date.get(Calendar.DAY_OF_MONTH);
		int h = Date.get(Calendar.HOUR_OF_DAY);
		int min = Date.get(Calendar.MINUTE);
		
		
		int first_d = Date.getActualMinimum(Calendar.DATE);
		int last_d = Date.getActualMaximum(Calendar.DATE);
		
		
		int wd = Date.get(Calendar.DAY_OF_WEEK); // 요일 일1 월2 화 3 ~
		
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
		
//		System.out.printf("%d년-%d월-%d일 %d:%d(%s)\n이제 게임을 시작하지",y,m,d,h,min,weekStr);
		
		System.out.printf("\t\t%d년 %d월\t\t \n", y, m);
		
		String cal[][] = new String[6][7];
		
		for(int i = 1 ; i < last_d+1; i++) {
			System.out.printf("%d ", i);
		}
				
		System.out.println();
		*/
		Scanner scan = new Scanner(System.in);
		//년도와 월 입력
		System.out.println("년도?");
		int year;
		year = scan.nextInt();
		System.out.println("월?");
		int month;
		month = scan.nextInt();
		
		
		Calendar date = Calendar.getInstance(); //오늘날짜+ 시간
		//날짜 바꾸기
		date.set(year, month-1, 1); //해당 년 월의 첫번째 요일 구하기
		
		//1일에 대한 요일 구하기
		int week = date.get(Calendar.DAY_OF_WEEK); //공백개수
		
		/*
		int lastDay = 31;
		switch(month) {
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			lastDay = 30; break;
		case 2 :
			if(year%4==0 && year%100!=0 || year%400==0) {
				lastDay = 29;
			}
			else {
				lastDay = 28;
			}
		}
		*/
		
		int lastDay = date.getActualMaximum(Calendar.DATE);
		
		//========================================
		//제목출력
		System.out.printf("\t\t\t%d년 %d월\t\t \n", year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		//System.out.println(lastDay);
		
		//공백 출력
		
		for (int space = 1; space < week; space++) {
			System.out.print("\t");
		}
		
		//날짜 출력
		for (int day = 1; day <= lastDay ; day++) {
			System.out.print(day + "\t");
			if( (day+week-1)%7 == 0) {
				System.out.println();
			}
		}
	}

}
