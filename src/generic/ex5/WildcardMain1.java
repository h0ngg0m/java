package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {

    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("Dog", 100));

        WildCardEx.printGeneticV1(dogBox);
        WildCardEx.printWildcardV1(dogBox);

        WildCardEx.printGeneticV2(dogBox);
        WildCardEx.printWildcardV2(dogBox);

        Dog dog = WildCardEx.printAndReturn(dogBox);
        Animal animal = WildCardEx.printAndReturnWildcard(dogBox);

        System.out.println("dog = " + dog);
        System.out.println("animal = " + animal);

    }
}
