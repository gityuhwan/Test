
public class Car {
	String carName = "소나타";
	int speed = 0;
	String carColor = "white";
	public Car() {//상속 관계일때는 매개변수없는 생성자는 써놓는게 낫다
			System.out.println("Car()생성자");
			
	}
	public Car(String carName, int speed, String carColor) {
		this.carName = carName;
		this.speed = speed;
		this.carColor = carColor;
		System.out.println("Car(Str,int,Str)생성자");
		
	}
	
	public void speedUp() {
		speed += 10;
		if(speed > 100) {
			speed = 100;
		}
	}
	
	public void speedDown() {
		speed -= 10;
		if(speed<0)
			speed = 0;
	}
	
}
