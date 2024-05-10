package exception.ex4.test;

public class Client {

    public void run(){
        System.out.println("Client is running");
        throw new RuntimeException("Client exception");
    }
}
