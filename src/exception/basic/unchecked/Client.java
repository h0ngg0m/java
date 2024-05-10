package exception.basic.unchecked;


public class Client {
    public void call() {
        throw new MyUncheckedException("ex"); // 언체크예외는 throws를 사용하지 않아도 된다. 예외가 발생하면 호출한 곳으로 자동으로 예외가 전파된다.
    }
}
