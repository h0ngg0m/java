# 제네릭

## 제네릭 명명 관례
타입 매개변수는 일반적인 변수명처럼 소문자로 사용해도 문제는 없다.
하지만 일반적으로 대문자를 사용하고 용도에 맞는 단어의 첫글자를 사용하는 관례를 따른다.

- E - Element
- K - Key
- N - Number
- T - Type
- V - Value
- S, U, V 등 - 두 번째, 세 번째, 네 번째 타입

## 상한 와일드카드

```java
import generic.ex2.Box;

static <T extends Animal> void printGeneric(Box<T> box) {
    T t = box.get();
    System.out.println("t.getName = " + t.getName);
}

static void printWildCardV2(Box<? extends Animal> box) {
    Animal animal = box.get();
    System.out.println("animal.getName = " + animal.getName());
}
```
- 제네릭 메서드와 마찬가지로 와일드카드에도 상한 제한을 둘 수 있다.
- 여기서는 `? extends Animal`로 Animal과 Animal의 하위 클래스만 받을 수 있도록 제한을 두었다.
- 결과적으로 Animal 타입의 기능을 호출할 수 있다.

## 제네릭 타입과 와일드카드의 차이

```java
// 전달한 타입을 명확하게 반환 받을 수 있다.
Dog dog = WildCardEx.printAndReturnGeneric(dogBox);

// 전달한 타입을 명확하게 반환 받을 수 없다. Animal 타입으로 반환 받는다.
Animal animal = WildCardEx.printAndReturnWildCard(dogBox);
```

## 하한 와일드카드
```java
public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();


        // Animal 포함 상위 타입 전달 가능
        writeBox(objectBox);
        writeBox(animalBox);
        // writeBox(dogBox); 컴파일 에러
        // writeBox(catBox); 컴파일 에러
    }

    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
```
- `? super Animal`로 Animal과 Animal의 상위 클래스만 받을 수 있도록 제한을 두었다.