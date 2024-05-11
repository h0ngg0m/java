package generic.ex3;

import generic.animal.Dog;

public class DogHospital {

    private Dog dog;

    public void set(Dog dog) {
        this.dog = dog;
    }

    public void checkup() {
        System.out.println("동물 이름: " + dog.getName());
        System.out.println("동물 크키: " + dog.getSize());
        dog.sound();
    }

    public Dog bigger(Dog target) {
        return dog.getSize() > target.getSize() ? dog : target;
    }
}
