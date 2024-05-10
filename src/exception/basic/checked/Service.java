package exception.basic.checked;

public class Service {
    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
        } catch (MyCheckedException e) {
            // 예외 처리
            System.out.println(e.getMessage());
        }
        System.out.println("정상흐름");
    }

    public void catchThrow() throws MyCheckedException {
        client.call();
        System.out.println("정상흐름");
    }

}
