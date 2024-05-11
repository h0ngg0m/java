package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);
        Integer result = (Integer) object;
        System.out.println("result = " + result);

        Integer result2 = GenericMethod.<Integer>genericMethod(i);
        System.out.println("result2 = " + result2);

        Integer result3 = GenericMethod.<Integer>numberMethod(i);
        System.out.println("result3 = " + result3);

        // String result4 = GenericMethod.<String>numberMethod(i); // Compile error
    }
}
