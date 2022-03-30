package sec3;

public class Exercis {

	public static void main(String[] args) {
		//int x = 10; 
		//int y = 20; 
		//int z = (++x)+(y--);
		//System.out.println("z : " +z);
		
		int score = 85;
		String result = (!(score>90))? "가" : "나";
		System.out.println("result : "+result);
		
		
		int pencils = 534;
		int students = 30;
		//학생 한 명이 가지는 연필 수
		int pencilsPerStudents = (pencils / students);
		System.out.println("pencilsPerStudents : " + pencilsPerStudents);
		
		//남은 연필 수
		int pencilsLeft = (pencils % students);
		System.out.println("pencilsLeft : " + pencilsLeft);
		
		//55
		int value = 356; //356%300=56 356-(356%300) -> 
		System.out.println("value - (value % 300) : "+ (value - (value % 300)));
		//6
		int lengthTop = 5;
		int lengthbottom = 10;
		int height = 7;
		double area = (lengthTop + lengthbottom)/2 * height;
		System.out.println("area : "+area);
		//7
		int x = 10;
		int y = 5;
		
		System.out.println("(x>7) && (y<=5) : " +((x>7) && (y<=5)) );
		System.out.println("( x%3 == 2 ) || (y%2 != 1): "+(( x%3 == 2 ) || (y%2 != 1)));
		//8
		
		double xx = 5.0;
		double yy = 0.0;
		double zz = xx%yy;
		
		if(Double.isNaN(value)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double resultt = zz + 10;
			System.out.println("결과 : "+resultt);
		}
		
		
	}

}
