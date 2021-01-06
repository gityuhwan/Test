package pac;

import java.util.Scanner;

public class Aclass {
	//멤버 변수
	int num = 500;
	String username = "홍길동";
	
	Scanner scan = new Scanner(System.in);
	
	//생성자(메소드)
	/* 
	 * 1. 생성자 메소드는 클래스명과 생성자(메소드)명이 같다
	 2. 메소드는 반드시 소괄호()가 있다
	 3. 생성자메소드는 반환(형)값이 없다
	 4. 매개변수(arguments)는 개수제한이 없다
	 5. 생성자 메소드는 객체 실행시 한번만 실행됨
	 6. 객체 생성시 여러개의 생성자 메소드 호출 하는 법
	*/
	public Aclass(int num, String name) {
		//지역변수와 멤버변수명이 같을 때 멤버변수를 지정하는 키워드: this.
		//중복될 경우에만 쓴다. this.username도 가능(하지만 귀-찮)
		this.num = num; 
		username = name;
	}
	
	public Aclass(){//생성자- 오버로딩
		
		System.out.println("Aclass() 생성자 실행 : ");
//		total(); // 메소드 호출 ( 생성자 메소드에서 일반 메소드 호출 후 실행)
	}
	public Aclass(int n){//Aclass()생성자 함께실행
		//반드시 첫번째 실행문으로 처리 - 다른생성자 호출할경우
		// int a = 5000; <<<중간에 실행문 끼워있으면 안됨
		this();
		System.out.println("Aclass(int n) 생성자 실행 : " + n);
	}
	public Aclass(int n, int y, String name){

		System.out.println("Aclass(int x, int y, String name) 생성자 실행 : " + n + y + name);
	}
	public Aclass(int a, int c, double firstname){
		System.out.println("Aclass(int a, int c, String firstname) 생성자 실행 : " + a + c + firstname);

	}
	//메소드
	/*
		   반환형 메소드명() == 소문자로 시작, () 있다.
	public void total(){
	
	}
	
	 */

	public void total(){
		int tot = 0;
		for(int i = 0; i <= 100; i++) {
			tot += i;
		}
		System.out.printf("tot=%d\n",tot);
		
	}
	public int sum(int max) {
		int sum = 0;
		for(int i = 1; i <=max ; i ++) {
			sum += i;
	}
		//	System.out.println("sum = " + sum);
		return sum;
	}
	
		public int sum() {
		return 22345;
	}
	
}

