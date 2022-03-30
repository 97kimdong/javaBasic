package sec2;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
        boolean run = true;      
        int balance = 0;	//잔고
        Scanner sc = new Scanner(System.in);
        int code, money;
        while(run) {
            System.out.println("-----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-----------------------------------");
            System.out.println("선택> ");
            code = sc.nextInt();
            
            //작성 위치
            switch(code) {
            	case 1:
            		System.out.println("입금액 : ");
            		money = sc.nextInt();
            		if(money>0) {
            			balance += money;//balance=balance+money;
            			System.out.println(money+"입금 처리되었습니다.");
            		} else {
            			System.out.println(money+"는 입금이 불가능합니다.");
            		}
            		break;
            	case 2:
            		System.out.println("출금액 : ");
            		money = sc.nextInt();
            		if(money>balance) {
            			System.out.println("출금예상액이 잔고보다 더 큽니다.");
            		} else {
            			balance -= money;//balance=balance-money;
            			System.out.println(money+"출금 처리되었습니다.");
            		}
            		break;
            	case 3:
            		System.out.println("잔고 : "+balance);
            		break;
            	case 4:
            		run = false;
            		break;
            	default:
            		System.out.println("잘못된 입력~!");
            }
        }
        System.out.println("프로그램 종료");    
		

	}

}
