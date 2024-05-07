# String

## new vs 리터럴
```java
String str1 = new String("Hello");
String str2 = new String("Hello");
System.out.println(str1 == str2); // false
System.out.println(str1.equals(str2)); // true

String str3 = "Hello";
String str4 = "Hello";
System.out.println(str3 == str4); // true
System.out.println(str3.equals(str4)); // true
```
- `new` 키워드로 생성한 String 객체는 서로 다른 객체이다.
- 리터럴로 생성한 문자열은 문자열 풀을 사용하기 때문에 같은 문자열은 같은 객체를 참조한다.
  - 자바가 실행되는 시점에 클래스에 문자열 리터럴이 있으면 문자열 풀에 `String` 인스턴스를 미리 만들어둔다. 이때 같은 문자열이 있으면 만들지 않는다.
  - 문자열 풀은 힙 영역에 존재한다.

## String - 불변
`String`은 불변 객체다. 따라서 생성 이후에 절대로 내부의 문자열 값을 변경할 수 없다.
- `String`은 자바 내부에서 문자열 풀을 통해 최적화를 한다.
- 만약 `String` 내부의 값을 변경할 수 있다면, 기존에 문자열 풀에서 같은 문자를 참조하는 변수의 모든 문자가 함께 변경되어 버리는 문제가 발생한다.