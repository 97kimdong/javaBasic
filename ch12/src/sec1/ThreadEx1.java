package sec1;
import java.awt.Toolkit;
public class ThreadEx1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		String[] names = {"김일","김둘","김셋","김넷","김오","김육","김칠","김팔","김구","김십"};
		for(int i =0; i<10; i++) {
			System.out.println(names[i]);
			if(names[i].equals("김팔")) {
				System.out.println("***** 확진자 *****");
				toolkit.beep();
				continue;
			} else {
				System.out.println("체온");
				System.out.println("정상");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
