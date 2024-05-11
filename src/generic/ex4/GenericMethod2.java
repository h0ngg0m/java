package generic.ex4;

public class GenericMethod2<T> {

    public static Object objMethod(Object obj) {
        System.out.println("obj = " + obj);
        return obj;
    }

    public T genericMethod(T obj) { // 클래스 레벨에서 선언한 타입 매개변수를 사용
        System.out.println("obj = " + obj);
        return obj;
    }

    public <T extends Number> T numberMethod(T obj) { // 메서드 레벨에서 선언한 타입 매개변수를 사용
        System.out.println("obj = " + obj);
        return obj;
    }
}
