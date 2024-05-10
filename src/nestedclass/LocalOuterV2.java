package nestedclass;

public class LocalOuterV2 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("print");
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        return new LocalPrinter();
    }

    public static void main(String[] args) {
        LocalOuterV2 outer = new LocalOuterV2();
        Printer printer = outer.process(7);
        printer.print();
        /*
        지역변수 localVar, paramVar는 LocalPrinter의 인스턴스 변수로 복사되어 사용된다.
         */
    }
}
