package sec4;

import java.lang.reflect.Method;
//에너테이션 = 컴파일러에게 앞으로 전개될 내용이 무엇인지 사전에 고지하는 것들
public class AlimEx1 {

	public static void main(String[] args) {
		Method[] declaredMethod = Service.class.getDeclaredMethods();
		for(Method method : declaredMethod) {
			System.out.println(method.getName());
		}

	}

}
