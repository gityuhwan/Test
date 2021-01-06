import java.util.Scanner;

public class Diamond2 {
	Scanner scan = new Scanner(System.in);
	public Diamond2() {
		
	}
	public void start() {
		
		System.out.print("홀수 입력 = ");
		int max = scan.nextInt();
		//짝수가 입력되면 홀수로
		if(max%2==0) max--;
		char txt = 'A';	
		int step = 2;
		//행
		for(int row=1; row > 0 ; row +=step) {
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
			if(row>=max) step = -2;
		}
	
	}
	
	public static void main(String[] args) {
		new Diamond2().start();

	}

}

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