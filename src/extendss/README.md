# 상속
- 상속 관계에서 자식 인스턴스를 생성할 때 상속 관계에 있는 부모까지 함께 포함해서 인스턴스를 생성한다.
참조값은 하나지민 실제로 그 안에서는 부모, 자식 두 가지 클래스 정보가 공존하는 것이다. 상속이라고 해서 단순히 부모의 필드와 메서드만 물려 받는 것이 아니고
부모 클래스도 함께 포함해서 생성된다. 외부에서 볼 때는 하나의 인스턴스를 생성하는 것 같지만 내부에서는 부모와 자식이 모두 생성되고 공간도 구분된다.