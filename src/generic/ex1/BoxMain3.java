package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<String> box1 = new GenericBox<>();
        box1.set("Hello");
        System.out.println(box1.get());

        GenericBox<Integer> box2 = new GenericBox<>();
        box2.set(123);
        System.out.println(box2.get());
    }
}
