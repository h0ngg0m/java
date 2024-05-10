package nestedclass;

public class AnonymousOuterV3 {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        /*
        Printer 인터페이스를 구현하는 익명 클래스를 생성한다.
        Printer는 인터페이스이기 때문에 인스턴스화 될 수 없다. 따라서 익명 클래스를 사용한다.
         */
        Printer printer = new Printer() { // 선언과 생성을 한 번에 하는 익명 클래스
            int value = 0;

            @Override
            public void print() {
                System.out.println("print");
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };
        printer.print();
    }

    public static void main(String[] args) {
        AnonymousOuterV3 outer = new AnonymousOuterV3();
        outer.process(2);
    }
}
