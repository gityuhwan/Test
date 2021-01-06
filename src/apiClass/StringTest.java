package apiClass;

public class StringTest {

	public StringTest() {
		String data = "서울시 마포구 백범로";
		String data2 = new String("서울시 마포구 백범로");
		
		if(data == data2) {
			System.out.println(data+ "와(과) " + data2+ "같다.");
		}else
			System.out.println(data+ "와(과) " + data2+ "다르다.");
		
		if(data.equals(data2)) {
			System.out.println("둘은 같다");
		}
		else {
			System.out.println("둘은 다르다");
		}
		
		//charAt() : index위치 문자 반환
		char result1 = data.charAt(5);
		System.out.println(result1);
		
		//concat() : 문자열의 연결 data+data2
		String data3 = " ing...Gogogo";
		String data4 = " Ing...Gogogo!!!";
		
		String result2 = data.concat(data3);
		System.out.println(result2);
		
		//equals()
		boolean boo1 = data3.equals(data4);
		System.out.println(boo1);
		boolean boo2 = data3.equalsIgnoreCase(data4);
		System.out.println(boo2);
		
		//getByte() : 문자열(입력)을 바이트 배열로 반환한다.
		byte result3[] = data3.getBytes();
		for( byte b : result3 ) {  // 확장된 for문 배열데이터를 이용
			System.out.println(b+ " -> " + (char)b);
		}
		
		//indexOf : 특정문자의 위치 index를 구한다. 특정문자 값 없을경우 -1 return.
		//.indexOf(String , 몇번지부터); 가능
		int result4 = data3.indexOf("ng");
		System.out.println(result4);
		
		//length() : 문자수
		int result5 = data3.length();
		System.out.println("length() = " +  result5);
		
		//replaceAll() : 특정위치의 문자를 변경 = (첫번째문자, 두번째문자) 첫번째를 두번째로
		String result6 = data3.replaceAll("ng", "loveyou");
		System.out.println(result6);
		
		//특정문자로 문자열 쪼개기
		String tel = "010-1234-5678";
		String result7[] = tel.split("-");
		for(int i = 0 ; i < result7.length; i++) {
			System.out.println("tel["+ i +"] = " + result7[i]);
		}
		//문자열의 일부 구하기
		String result8 = data3.substring(5); // index 5부터 끝까지 구한다
		System.out.println(result8);
		String result9 = data3.substring(5, 10); // index 5부터 10앞까지 구한다
		System.out.println(result9);
		
		//대소문자 변환
		System.out.println("소문자로 = " + data3.toLowerCase());
		System.out.println("대문자로 = " + data3.toUpperCase());
		
		//int result10 = data3.compareTo(data4);
		
		//compareTo : 문자열의 크기비교 0 이면 두문자가 같다. 음수면 오른쪽이 크다.
		// 0 == 같다 , 양수 : 왼쪽 객체가 크다 음수: 왼쪽 객체가 작다
		String str1 = "길동";//"Oracle";
		String str2 = "순신";//"oracle";
		int result10 = str1.compareTo(str2);
		System.out.println(result10);
		
		//trim : 앞뒤 공백 제거
		String str3 = "     java programming     ";
		System.out.println(str3.trim());
		
		//기본데이터타입 + char배열을 문자열로 변환하는 메소드
		int num = 1234;
		String numtxt = String.valueOf(num);
		System.out.println(numtxt+100);
		
		new Integer(8888);
		new Integer("5254");
		
		int num2 = 4567;
		
		Integer num2Int = Integer.valueOf(num2);
		
		
		// 1.5버전 이상
		/* Integer numInt = new Integer(1234); 객체선언해서 넣어줘야함 */
		Integer numInt = 1234; // 기본데이터를 클래스타입 데이터로 : 오토박싱
		int num3 = Integer.valueOf(9999); // 객체(Integer)가 일반데이터타입(int)으로 : 오토언박싱
		
		/*
		StringBuffer ab = new StringBuffer();
		ab.append("b"); // 객체를 생성하지않아도 저장됨?

		System.out.println(ab);
		*/
		
//		char c = 'a';
		
		
//		c++;
		
		
//		c = (char)(c + 3);
		
		
//		byte b = 127;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StringTest();
		
	}

}
