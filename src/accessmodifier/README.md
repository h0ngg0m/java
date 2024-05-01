# 접근 제어자
- private: 모든 외부 호출을 막는다.
- default (package-private): 같은 패키지 내에서만 접근 가능하다.
- protected: 같은 패키지 내에서는 접근 가능하고, 패키지가 달라도 상속 관계의 호출은 허용한다.
- public: 모든 외부 호출을 허용한다.

순서대로 `private`이 가장 많이 차단하고, `public`이 가장 많이 허용한다.

# 접근 제어자 - 클래스 레벨
클래스 레벨의 접근 제어자 규칙
- 클래스 레벨의 접근 제어자는 `public`과 `default`만 가능하다.
  - `private`와 `protected`는 클래스 레벨에서 사용할 수 없다.
- `public` 클래스는 반드시 파일명과 이름이 같아야 한다.
  - 하나의 자바 파일에 `public` 클래스는 하나만 존재할 수 있다.
  - 하나의 자바 파일에 `default` 접근 제어자를 사용하는 클래스는 무한정 만들 수 있다.
