package pac;
//패키지 (윈도우 폴더 == 자바 패키지)


import java.util.Scanner;
import java.util.Calendar;
import java.lang.String;
// 자주쓰는건(java.lang) javac가 알아서 import
import java.util.*;
//유틸안에 모든 클래스

//import문 - 다른 클래스를 객체 또는 상속을 받아 사용할 때 클래스가 있는 위치를 알려준다

public class AAA {
	//멤버 영역 = 실행문을 구현할 수 없다. 멤버 변수 값 넣기만 가능
	public static void main(String[] args) {
		//다른 클래스에서 구현한 기능을 사용할때
		// 1. 객체(new) : 생성자 메소드 2. 상속

		Aclass obj = new Aclass();
		// 레퍼런스 변수
		// 변수에 선언해서 저장
		int num = 100;
		
		System.out.println(obj);
		
		Aclass obj2 = new Aclass(10,5,"hong");
		
		System.out.println(obj2 + "77777");
		
		Aclass obj3 = new Aclass(99999); // 객체 생성시 여러개의 생성자 메소드 호출 하는 법
		
		
		obj2.total(); //객체내의 메소드 호출
		int result = obj.sum(50);
		System.out.println("result = " + result);
		
		System.out.println(obj.sum());
		
		// A클래스 호출방법 : 객체, 상속  문법 == new A()
		
		
		// 멤버 변수(heap에 생성), 클래스 전체에서 쓰는 전역 변수
		
		//생성자 메소드
		/*
		 *객체 만들때 실행되는 메소드
		 1. 생성자 메소드는 클래스명과 생성자 메소드명이 같다
		 2. 메소드는 반드시 소괄호()가 있다
		 3. 생성자메소드는 반환값이 없다
		 4. 매개변수(arguments)는 개수제한이 없다
		 5. 생성자 메소드는 객체 실행시 한번만 실행됨
		 6. 객체 생성시 여러개의 생성자 메소드 호출 하는 법
		*/
		
		//메소드
		/*기능 구현을 위한, 호출할때 실행
		반환형 메소드명() == 소문자로 시작, () 있다.
			public void total(){
	
			}
		*/
		
		//메인메소드
		
		//내부클래스
		
		
	}
	
	// Class 규칙 : 대문자로 시작. 합성어면 첫글자가 대문자. 클래스명이 곧 파일명
	
	//public == 접근제한
	// public 없으면 default == 같은폴더 패키지안에 넣어놔야 쓸수있음 

}
