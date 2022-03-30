package sec1;

public class Array3 {

	public static void main(String[] args) {
		String[] names = {"김태균","김효민","신길호","여승원","이규진"};
		//5명의 3과목 점수 선언 jum[][]
		int[][] jum = {{100,80,90},{70,90,80},{60,50,70},{80,90,100},{100,70,30}};
		int hap = 0;
		float py = 0.0f;
		int[] tot = new int[3];
		float[] avg = new float[3];
		//전체총점(hap), 전체평균(py), 과목총점(tot), 과목평균(avg)
		for(int i=0;i<names.length;i++)	{
			for(int j=0;j<3;j++)	{
				tot[j]+=jum[i][j];			//과목별 총점 누적
				hap+=jum[i][j];
			}
		}
		
		for(int i=0;i<3;i++) {	//과목별 평균 계산
			avg[i] = (float) tot[i] / names.length;
		}
		System.out.println("성명\t국어\t영어\t수학");
		System.out.println("*************************************");
		//결과 출력
		for(int i=0;i<names.length;i++)	{
			System.out.println(names[i]);   //이름출력
			for(int j=0;j<3;j++)	{
				System.out.println("\t"+jum[i][j]);	   //점수출력
				
			}
		}
		System.out.println("*************************************");
		System.out.println("\t");
		for(int i =0;i<3;i++)	{
			System.out.println("\t\t"+tot[i]);
		}
		for(int i =0;i<3;i++)	{
			System.out.println("\t"+avg[i]);
		}
		System.out.println("*************************************");
	}

}
