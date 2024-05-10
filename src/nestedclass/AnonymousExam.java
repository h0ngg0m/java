package nestedclass;

public class AnonymousExam {

    interface Runnable {
        void run();
    }


    public static void hello(Runnable runnable) {
        System.out.println("start");
        runnable.run();
        System.out.println("end");
    }


    public static void main(String[] args) {
        hello(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is anonymous class");
            }
        });

        hello(() -> System.out.println("This is anonymous class")); // 위 코드와 정확히 똑같이 동작
    }
}
