import java.util.Scanner;

public class Diamond {
	Scanner scan = new Scanner(System.in);
	public Diamond() {
		
		
		
	}
	public void start() {
		
		System.out.print("홀수 입력 = ");
		int max = scan.nextInt();
		//짝수가 입력되면 홀수로
//		if(max%2==0) max--;
		
		char txt = 'A';
		
		
		//행
		for(int row=1; row<=max; row +=2) {
			//공백
			for(int space =1 ; space<=(max-row)/2; space++) {
			System.out.print(" ");
				
			}
			//문자출력
			for(int col = 1 ; col <= row; col++) {
			System.out.print(txt++);
			if(txt>'Z') {
				txt = 'A';
			}
			}
			System.out.println();
		}
		//역삼각형
		for(int row = max-2; row>=1; row-=2 ) {// 7, 5, 3, 1
			//공백
			for(int space = 1; space <= (max-row)/2; space++) {
				System.out.print(" ");
			}
			//문자
			for(int col = 1; col<=row; col++) {
				System.out.print(txt++);
				if(txt>'Z') txt='A';
			}
			System.out.println();
			//줄바꿈
			
		}
		
		
		
	}
	

	public static void main(String[] args) {
		new Diamond().start();
		//1줄찍을때 공백 8개
		/*
		  알파벳 공백
			1 + 8
			3 + 6
			5 = 4
		*/
		
			//라인수: 문자의 개수는 입력값까지 2씩증가	
			//공백의 개수 : (입력값-출력할문자수)/2
			//문자의개수 : A계산
			
		//바깥쪽 홀수만큼 : 라인개수
		
		
		
		
		
		
		
	
		//출력 A-Z
		

	}

}
