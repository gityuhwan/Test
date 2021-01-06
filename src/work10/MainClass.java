package work10;

import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 	menu
		  
		  	1. 학생수 입력		  	
		  	      학생 점수들(이름, 국어, 수학, 영어) 입력
		  			
			2. 총점 Sum
			
			3. 평균 Avg
			
			4. 1등	Max
			
			5. 꼴등	Min		
		*/
		
		String student[][] = {
				{ "홍길동", "90", "100", "85" },
				{ "성춘향", "100", "100", "90" },
				{ "일지매", "95", "85", "80" },
		};
		
		while(true) {
		
			System.out.println("menu--------------------");
			System.out.println("1.학생정보 입력");
			System.out.println("2.총점");
			System.out.println("3.평균");
			System.out.println("4.1등 학생");
			System.out.println("5.꼴등 학생");
			System.out.println("6.국어점수 순위 출력");
			
			System.out.print(">> ");
			int workNum = sc.nextInt();
			
			if(workNum == 1) {		// 입력				
				System.out.print("학생 몇명을 입력하시겠습니까? = ");
				int count = sc.nextInt();
				
				student = new String[count][4];	// 동적할당
								
			//	String title[] = { "이름", "국어", "영어", "수학" };
				
				int w = 0;
				while(w < count) {					
					System.out.println( (w + 1) + "번째 학생 >>" );
					
					System.out.print("이름 = ");
					String name = sc.next();
					
					System.out.print("국어 = ");
					String lang = sc.next();
					
					System.out.print("영어 = ");
					String eng = sc.next();
					
					System.out.print("수학 = ");
					String math = sc.next();
					
					student[w][0] = name;
					student[w][1] = lang;
					student[w][2] = eng;
					student[w][3] = math;
					
					/*
					for (int i = 0; i < title.length; i++) {
						System.out.print(title[i] + " = ");
						String str = sc.next();						
						
						student[w][i] = str;
					}
					*/
					
					w++;
				}	
				
				// 확인용
				for (int i = 0; i < student.length; i++) {
					System.out.println(Arrays.toString(student[i]));
				}				
			}
			else if(workNum == 2) {	// 총점				
				int sum = 0;
				for (int i = 0; i < student.length; i++) {
					for (int j = 1; j < student[i].length; j++) {
						sum = sum + Integer.parseInt(student[i][j]);
					}
				}
				System.out.println("총점:" + sum);				
			}
			else if(workNum == 3) { // 평균
				int sum[] = new int[student.length];
				
				for (int i = 0; i < student.length; i++) {	// 학생수
					for (int j = 1; j < student[i].length; j++) {
						sum[i] = sum[i] + Integer.parseInt(student[i][j]);
					}
				}							
				// System.out.println(Arrays.toString(sum));
				
				int allSum = 0;
				for (int i = 0; i < sum.length; i++) {
					allSum = allSum + sum[i];
				}
				
				double avg = allSum / student.length;
				System.out.println("평균:" + avg);
			}
			else if(workNum == 4) { // 1등
				int sum[] = new int[student.length];
				
				for (int i = 0; i < student.length; i++) {	// 학생수
					for (int j = 1; j < student[i].length; j++) {
						sum[i] = sum[i] + Integer.parseInt(student[i][j]);
					}
				}
				
				int max = 0;
				int index = 0;
				// 1등 점수
				for (int i = 0; i < sum.length; i++) {
					if(max < sum[i]) {	
						max = sum[i];
						index = i;
					}
				}		
				System.out.println("1등점수:" + max);
				
				// 누구?
				System.out.println("1등학생 이름:" + student[index][0]);
				
			}
			else if(workNum == 5) { // 꼴등
				int sum[] = new int[student.length];
				
				for (int i = 0; i < student.length; i++) {	// 학생수
					for (int j = 1; j < student[i].length; j++) {
						sum[i] = sum[i] + Integer.parseInt(student[i][j]);
					}
				}
				
				int min = sum[0];
				for (int i = 0; i < sum.length; i++) {
					if(min > sum[i]) {
						min = sum[i];
					}
				}
				
				System.out.println("최저점수:" + min);				
			}
			
			else if(workNum == 6) {
				String language[][] = new String[student.length][2];//행이3 컬럼이 2개 
				
				for (int i = 0; i < student.length; i++) {
					language[i][0] = student[i][0];	// 이름
					language[i][1] = student[i][1];	// 국어
				}
				
				String temp[] = null;
				for (int i = 0; i < language.length - 1; i++) {
					for (int j = i + 1; j < language.length; j++) {
						
						int s1 = Integer.parseInt(language[i][1]);
						int s2 = Integer.parseInt(language[j][1]);
						
						if(s1 < s2) {
							temp = language[i];
							language[i] = language[j];
							language[j] = temp;
						}						
					}
				}
				
				for (int i = 0; i < language.length; i++) {
					System.out.println((i + 1) + "등 " + language[i][0] + " 점수:" + language[i][1]);					
				}
				
			}
		}
	}
}







