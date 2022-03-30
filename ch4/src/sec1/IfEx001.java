package sec1;

import java.util.Scanner;

public class IfEx001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edps, pl, db, tot;
		float avg;
		String pan = "불합격";
		System.out.println("전산점수 입력 : ");
		edps = sc.nextInt();
		System.out.println("프로그래밍점수 입력 : ");
		pl = sc.nextInt();
		System.out.println("데이터베이스점수 입력 : ");
		db = sc.nextInt();
		
		tot = edps + pl + db;
		avg = tot/3.0f;
		
		System.out.println("총점 : "+tot);
		System.out.printf("평균 : %.2f \n", avg);
		
		if (edps>=70 && pl>=70 && db>=70) {
			pan = "합격";
		}
		System.out.println("합격여부 : "+pan);
		
		System.out.print("학점 : ");
		if (avg>=98) {
	System.out.print("A+");
		}else if (avg>=94) {
			System.out.print("A0");
		}else if (avg>=90) {
			System.out.print("A-");
		}else if (avg>=88) {
			System.out.print("B+");
		}else if (avg>=84) {
			System.out.print("B0");
		}else if (avg>=80) {
			System.out.print("B-");
		}else if (avg>=78) {
			System.out.print("C+");
		}else if (avg>=74) {
			System.out.print("C0");
		}else if (avg>=70) {
			System.out.print("C-");
		}else if (avg>=68) {
			System.out.print("D+");
		}else if (avg>=84) {
			System.out.print("D0");
		}else if (avg>=60) {
			System.out.print("D-");
		}else if (avg<60) {
			System.out.print("F");
		}
			System.out.print("\n");
		if (edps>=95 && pl>=95 && db>=95) {
			System.out.println("특장학생");
		}else if (edps>=95 || pl>=95 || db>=95) {
			System.out.println("과목장학생");
		}else {
			System.out.println("일반학생");
		}
	}
}
