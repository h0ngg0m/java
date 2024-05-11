package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("Integer Value: " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("Hello World");
        String string = (String) stringBox.get();
        System.out.println("String Value: " + string);

        // 잘못된 타입의 인수 전달
        integerBox.set("Hello World");
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외
        System.out.println("Integer Value: " + result);
    }
}
