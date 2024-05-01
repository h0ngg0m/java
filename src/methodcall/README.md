# 기본형 vs 참조형 메서드 호출
## 대원칙: 자바는 항상 변수의 값을 복사해서 대입한다

### 1. 기본형 메서드 호출
```java
public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("before a = " + a); // 10
        changePrimitive(a);
        System.out.println("after a = " + a); // 10
    }

    public static void changePrimitive(int x) {
       x = 20;
    }
}
```
- 값(10)을 복사해서 대입하기 때문에 메서드 호출 후에도 값이 변하지 않는다.

### 2. 참조형 메서드 호출
```java
class Data {
    int value;
}

public class MethodChange2 {

    public static void main(String[] args) {
        Data data1 = new Data();
        data1.value = 10;
        System.out.println("before data1.value = " + data1.value); // 10
        changeReference(data1);
        System.out.println("after data1.value = " + data1.value); // 20
    }

    private static void changeReference(Data dataX) {
        dataX.value = 20;
    }

}
```
- 참조형은 주소값을 복사해서 대입하기 때문에 메서드 호출 후에 값이 변한다.