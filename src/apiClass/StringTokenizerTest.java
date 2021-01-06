package apiClass;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public StringTokenizerTest() {
		
		
	}
	public void start() {
		
		String hobby = "등산///쇼핑/IT////축구,인터넷,야구";
		
		
		// "/" 기준으로 자른다 : hobby의 토큰은 4개 발생
		StringTokenizer st  = new StringTokenizer(hobby, "/,");
		
		System.out.println(st);
		
		System.out.println("토큰수 = " + st.countTokens());
		
		// 토큰이 있으면
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
			new StringTokenizerTest().start();
	
	}

}
