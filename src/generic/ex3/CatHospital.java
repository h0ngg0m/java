package generic.ex3;

import generic.animal.Cat;

public class CatHospital {

    private Cat cat;

    public void set(Cat cat) {
        this.cat = cat;
    }

    public void checkup() {
        System.out.println("동물 이름: " + cat.getName());
        System.out.println("동물 크키: " + cat.getSize());
        cat.sound();
    }

    public Cat bigger(Cat target) {
        return cat.getSize() > target.getSize() ? cat : target;
    }
}
