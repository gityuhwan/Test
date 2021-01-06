
public class StandardWeight {
	//클래스안 멤버변수 : 다른 메소드에서도 사용하기 위해 멤버변수로 설정(전역변수)
	int age;
	int gender;
	//클래스안 생성자 (메소드)
	public StandardWeight() {//매개변수없는 생성자 메소드는 컴파일시 javac.exe가 추가해준다
		/*	매개 변수 없는 생성자메소드는 상속관계를 위해 생성해줘야한다.	 */
		//실행부
	}
	
	public StandardWeight(int a) {
	}
	
	//클래스안 메소드
	public void start() {
		age = CalendarObject.getInput("나이"); //나이
		gender = CalendarObject.getInput("성별(1:남성, 2:여성)");
		int height = CalendarObject.getInput("키");
		int weight = CalendarObject.getInput("현재체중");
		
		double standard = getStandardWeight(height);
		double standardIndex = (weight/standard)*100; //표준체중지수
		String stanstr = standardStr(standardIndex);
		
		System.out.println("표준체중 = " + standard);
		System.out.println("당신의 표준체중지수는 " + standardIndex + " 체형은 " + stanstr + "입니다.");
	}
	
	
	//표준체중 메소드 : 나이, 키
	//표준체중을 return 한다.
	public double getStandardWeight(int height) {
		double idx = 0.90;
		if(age<=35 && gender == 2) {
			idx = 0.85;
		}
		if(age>=36 && gender == 1) {
			idx = 0.95;
		}
		double standard = (height - 100)*idx;
		return standard;

	}
	//표준체중지수를 이용한 체형구하기
	public String standardStr(double idx) {
		String result = "";
		// if else if : 조건에 맞는 식이 한번만 실행
		if(idx<86) {
			result = "마른형";
		}else if(idx<96) {
			result = "조금마른형";
		}
		else if(idx<116) {
			result = "표준형";
		}
		else if(idx<126) {
			result = "조금비만형";
		}
		else{
			result = "비만형";
		}
		return result;
	}
	
	public static void main(String[] args) {
//		StandardWeight sw = new StandardWeight(); 객체를 만들어 레퍼런스 변수에 집어넣음
//		sw.start(); 그뒤에 호출
		
		new StandardWeight().start(); //객체를 만들어 바로 호출
		
		
	}

}
