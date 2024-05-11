package generic.ex5;

import generic.animal.Animal;

public class WildCardEx {

    static <T> void printGeneticV1(Box<T> box) {
        System.out.println("box.get() = " + box.get());
    }

    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGeneticV2(Box<T> box) {
        T t = box.get();
        System.out.println("t.getName() = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("t.getName() = " + animal.getName());
    }

    static <T extends Animal> T printAndReturn(Box<T> box) {
        T t = box.get();
        System.out.println("t.getName() = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("t.getName() = " + animal.getName());
        return animal;
    }
}
