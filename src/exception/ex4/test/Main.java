package exception.ex4.test;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        try {
            service.use();
        } catch (RuntimeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
