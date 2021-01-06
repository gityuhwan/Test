package apiClass;

public class StringBufferTest {

	public StringBufferTest() {
		// 스트링버퍼 : 문자열을 비동기식으로 처리. 문자열이 자주 바뀌는 경우 유용
		
		StringBuffer sb = new StringBuffer();
		
		StringBuffer ab = new StringBuffer();
		
		ab.append("b"); // 객체를 생성하지않아도 저장됨?
		System.out.println(ab);
		
		//append : 문자열 추가
		sb.append(true);
		sb.append("Spring");
		
		// insert : 중간에 문자열 삽입
		sb.insert(5,  "Mybatis");
		
		// 문자열 삭제
		sb.delete(4, 10);
		
		
		// 문자열 뒤집기
		sb.reverse();
		System.out.println("sb - >" + sb);
		System.out.println("capacity - >" + sb.capacity());
		
		}

	public static void main(String[] args) {
		new StringBufferTest();
		
	}

}
