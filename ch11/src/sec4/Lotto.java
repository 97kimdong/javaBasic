package sec4;
import java.util.Arrays;
import java.util.Random;
public class Lotto {

	public static void main(String[] args) {
		int l[] = new int[6];
		int max = 45;
		int min = 1;
		for(int i=0;i<5;i++) {
			for(int j=0;j<6;j++) {
				if(l[i] == l[i]) {
					System.out.println("중복"+l[i]);
					i--;
				}else {
					System.out.print(((int) (Math.random()*45)+1)+"\t");
				}
			}System.out.println("\n");
		}

	}

}
