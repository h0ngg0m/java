package generic.ex1;

public class BoxMain1 {

    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);
        System.out.println("Integer Value: " + integerBox.get());

        StringBox stringBox = new StringBox();
        stringBox.set("Hello World");
        System.out.println("String Value: " + stringBox.get());
    }
}
