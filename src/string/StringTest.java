package string;

public class StringTest {

    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true

        String str3 = "Hello";
        String str4 = "Hello";
        System.out.println(str3 == str4); // true
        System.out.println(str3.equals(str4)); // true
    }
}
