package methodcall;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("before a = " + a);
        changePrimitive(a);
        System.out.println("after a = " + a);
    }

    public static void changePrimitive(int x) {
       x = 20;
    }
}
