package sec2;

public class ForEx01 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=0;i<=100;i+=3) {
			sum += i;
			
		}	
		System.out.println("1~100 3의 배수의 합계1 : "+sum);	
		sum = 0;
		for(int b=0;b<=100;b++)	{
			if(b % 3 == 0)	{
				sum+=b;
			}
		}	System.out.println("1~100 3의 배수의 합계2 : "+sum);
			sum =0;
		for(int c=0;c<=100;c++) {
			if(c % 3 != 0) {
				continue;
			}
			sum += c;
		}
		System.out.println("1~100 3의 배수의 합계3 : "+sum);
	}
}
