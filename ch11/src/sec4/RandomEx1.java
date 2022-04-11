package sec4;
import java.util.Arrays;
import java.util.Random;

public class RandomEx1 {
	public static void main(String[] args) {
	//Random.nextInt(종료값)+시작값
	//Random.nextDouble() : 0~1의 실수 반환
	//Random.nextBoolean() : true 또는 false를 무작위로 반환
	Random random = new Random(3);
	int[] selNum = new int[6];
	for(int i=0;i<6;i++) {
		selNum[i] = random.nextInt(45)+1;
		}
	}
}
