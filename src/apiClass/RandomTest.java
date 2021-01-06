package apiClass;

import java.util.Random;

public class RandomTest {

	public RandomTest() {
		start();
	}
	public void start() {
		//random 난수클래스
		Random ran = new Random();
		for(int  i = 1 ; i <= 10 ; i++) {
			boolean ranBoo = ran.nextBoolean(); // 논리형 true, false
			
			
			double result = ran.nextDouble();
			//Math.random :난수*(끝값 - 첫값 +1) + 첫값
			int result2 = ran.nextInt();
			result2 = ran.nextInt(100); // 0~ 99사이의 난수발생 (int bound) bound 미만의 수
			result2 = ran.nextInt(10);// nextInt계산범위:난수 *(끝값 - 첫값 +1)
			
			System.out.println(result2 + "\t");
			if(i%10==0) System.out.println();
		}
		
	}

	public static void main(String[] args) {
		new RandomTest();

	}

}
