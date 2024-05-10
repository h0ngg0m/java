package exception.basic.unchecked;


/*
Unchecked 예외는 예외를 잡거나, 던지지 않아도 된디.
예외를 잡지 않으면 자동으로 밖으로 던진다.
 */
public class Service {

    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            // 예외 처리
            System.out.println("예외 처리, message=" + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    /*
    예외를 잡지 않아도 된다. 자연스럽게 상위 호출자로 예외가 전파된다.
    체크 예외와 다르게 throws를 사용하지 않아도 된다.
     */
    public void callThrow() {
        client.call();
        System.out.println("정상 로직");
    }
}
