package sec4;
import java.util.Scanner;
public class Array_lotto{
	public static void main(String[] args) {
    /*********코드 시작*********/
		int Lotto[] = new int[6];//로또 번호 받을 배열
		int Random = 0;//Random숫자 담을 변수
        
    /*****최종 완성된 로또 번호 입력 반복문*****/
		for(int i = 0 ; i < 6; i++)
		{
        
	/*****로또 번호 생성 반복문*****/
    		while(true)
			{
				Random = (int)(Math.random()*100 %45); // 하단 추가설명 1번
				System.out.printf("%d ",Random);// 숫자 확인 차 넣음
                
                if(Random == 0)
				{
					continue;// 영이 나올 경우 
			 	}
                

				for(int j=0;j<5;j++)
				{
					if(Random == Lotto[i])// 같은 숫자일 경우
						continue; //
				}
                
     /**** 모든 조건 만족했다면 ****/
				break;
			}
    //****모든 검사를 마친 로또번호에 집어 넣자****//
			Lotto[i] = Random;
			
		}
		System.out.println("");
		for(int k=0;k<6;k++)
			System.out.printf("%d ",Lotto[k]);
		
	}
}

