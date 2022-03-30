package sec1;

import java.util.Scanner;

public class SwitchEx2 {

//본인의 월을 숫자 정수로 입력하면, 해당하는 월의 탄생석을 출력
//1월 : 석류석
//2월 : 자수정
//3월 : 남옥
//4월 : 다이아몬드
//5월 : 비취(에메럴드)
//6월 : 진주(펄)
//7월 : 홍옥(루비)	
//8월 : 감람석	
//9월 : 청옥(사파이어)
//10월 : 오팔
//11월 : 황옥(토파즈)
//12월 : 터키석
	public static void main(String[] args) {
		System.out.println("1:석류석, 2:자수정, 3:남옥, 4:다이아몬드, 5:비취(에메랄드),"
		+ " 6:진주(펄), 7:홍옥(루비), 8:감락석, 9:청옥(사파이어), 10:오팔, 11:황옥, 12:터키석");
		System.out.println("태어난 월을 입력[1 - 12]");
		Scanner sc = new Scanner(System.in);
		int mode = sc.nextInt();
		switch(mode) {
		case 1:
			System.out.println("1월 석류석");
			break;
		case 2:
			System.out.println("2월 석류석");
			break;
		case 3:
			System.out.println("3월 남옥");
			break;
		case 4:
			System.out.println("4월 다이아몬드");
			break;
		case 5:
			System.out.println("5월 에메랄드");
			break;
		case 6:
			System.out.println("6월 진주");
			break;
		case 7:
			System.out.println("7월 홍옥");
			break;
		case 8:
			System.out.println("8월 감람석");
			break;
		case 9:
			System.out.println("9월 청옥");
			break;
		case 10:
			System.out.println("10월 오팔");
			break;
		case 11:
			System.out.println("11월 황옥");
			break;
		default :
			System.out.println("12월 터키석");
			break;			
		}
	}
}
