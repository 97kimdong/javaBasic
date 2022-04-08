package sec3;
//사용자 예외처리 만들기 - 자바 기본 클래스인 Exception
public class BalanceUnderFlowException extends Exception {
	public BalanceUnderFlowException() { }
	public BalanceUnderFlowException(String message) {
		super(message);
	}
}
