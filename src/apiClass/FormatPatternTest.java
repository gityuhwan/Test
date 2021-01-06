package apiClass;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormatPatternTest {

	public FormatPatternTest() {
		try {
			
			int won = 565723854;
			//		56,567,854원
			//		67,854원111
			
			DecimalFormat dFmt =new DecimalFormat("#,###원");
			
			String WonStr = dFmt.format(won);
			
			System.out.println("스트링타입 원 = " + WonStr);
			
	//		int b = Integer.parseInt(WonStr);
	//		System.out.println(b);
			
			//패턴화 된 데이터를 원래 데이터 돌려놓기
			//getInstance 메소드를 통해 NumberFormat 객체 호출
			NumberFormat nFmt = NumberFormat.getInstance();
			// 패턴화된 정보를 NumberFormat에 파싱
			Number num = nFmt.parse(WonStr);
			
			int numValue= num.intValue();
			
			System.out.println("숫자 = " + numValue);
			
			//날짜 패턴 2021 - 01 - 04(월) 11월 25일 오전
			
			/*사용클래스*/
			//SimpleDateFormat 클래스
			//Calendar
			//String 
			//DateFormat 
			
			String pattern = "yyyy-MM-dd(E) hh:mm aa";
			SimpleDateFormat dateFmt = new SimpleDateFormat(pattern);
			
			Calendar now = Calendar.getInstance();
			
			String dateStr = dateFmt.format(now.getTime());
			System.out.println(dateStr);
			
		}catch(Exception e) {
			
			
		}
			
			
			
	}

	public static void main(String[] args) {
		new FormatPatternTest();
		
		
	}

}
