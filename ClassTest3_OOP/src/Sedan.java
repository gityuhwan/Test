import java.util.Iterator;

//클래스를 상속받을 시 extends를 이용한다.
// 클래스는 1개만 상속받을 수 있다.

public class Sedan extends Car {//상속관계에서는 상위클래스의 생성자를 먼저 실행
	//하위클래스에서 변수를 상위클래스의 변수와 같은 이름 가능
	String carColor = "Orange";//상위클래스에 변수가 있어도 내클래서에서 먼저실행(가까운곳)
	int speedmax = 150;	
	public Sedan() {
		System.out.println("sedan() 생성자메소드 실행");
	}
	public Sedan(String carName, String carColor) {
		//상위클래스의 생성자 호출하는 방법, 매개변수없는 생성자는 호출안됨
		//상위클래스의 생성자호출은 첫번째 행으로 표시
		super("그랜져", 50, "Gray"); //생성자호출은 첫번째
		
		this.carName/*this.carname도 가능. 자신클래스에 해당 변수없으면 상속관계 변수호출*/ = carName;
		super.carColor = carColor;
		System.out.println("sedan(String,String)" + carName + carColor);
	}
	public void start() {
		System.out.println("색상 : " + carColor);
		System.out.println("색상(부모) : " + super.carColor);//상위클래스 carColor
		System.out.println("이름 : " + carName);
	}
	public void speedUp() {// 오버라이딩 : 원래 부모클래스에 있는걸 상속받은 클래스가 다시 재정의.
		speed += 15;
		if(speed>150) {
			speed = 150;
		}
	}
	
	

	public static void main(String[] args) {
		Car e = new Sedan();
		Sedan s = new Sedan();
//		s.start();
//		Sedan ss = new Sedan("레오", "Blue");
//		ss.start();
		
		for( int i = 0 ; i < 45 ; i++) {
		s.speedUp();
		}
		System.out.println(s.speed);
		
		
	}

}
