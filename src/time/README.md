# 날짜와 시간

## 기본 날짜와 시간 - LocalDateTime
가장 기본이 되는 날짜와 시간 클래스는 `LocalDate`, `LocalTime`, `LocalDateTime`이다.
- `LocalDate`: 날짜만 표현할 때 사용한다. 년, 월, 일을 다룬다. 예) 2021-07-01
- `LocalTime`: 시간만 표현할 때 사용한다. 시, 분, 초, 밀리초를 다룬다. 예) 12:30:45.123
  - 초는 밀리초, 나노초 단위도 포함할 수 있다.
- `LocalDateTime`: 날짜와 시간을 모두 다룰 때 사용한다. 예) 2021-07-01T12:30:45.123

앞에 `Local`이 붙은 이유는 `Local`이라는 것은 세계 시간대를 고려하지 않는다는 의미이다. 즉, 시간대를 고려하지 않는 날짜와 시간을 다루는 클래스이다.

## ZonedDateTime
`ZonedDateTime`은 `LocalDateTime`에 시간대 정보인 `ZoneId`가 합쳐진 것이다.

### ZonedDateTime 클래스
```java
public class ZonedDateTime {
    private final LocalDateTime dateTime;
    private final ZoneOffset offset;
    private final ZoneId zone;
}
```
ZonedDateTime: 시간대를 고려한 날짜와 시간을 표현할 때 사용한다. 여기에는 시간대를 표현하는 타임존이 포함된다.
- 예) 2021-07-01T12:30:45.123+09:00[Asia/Seoul]
- +09:00은 UTC로 부터의 시간대 차이다. 오프셋이라 한다. 한국은 UTC보다 +09:00 시간이다.
- Asia/Seoul은 타임존이다. 이 타임존을 알면 오프셋도 알 수 있다. +09:00 같은 오프셋 정보도 타임존에 포함된다.
- 추가로 ZoneId를 통해 타임존을 알면 일광 절약 시간제(썸머타임)에 대한 정보도 알 수 있다. 따라서 썸머타임이 적용된다.

## OffsetDateTime
OffsetDateTime은 LocalDateTime에 UTC 오프셋 정보인 ZoneOffset이 추가된 것이다.

### OffsetDateTime 클래스
```java
public class OffsetDateTime {
    private final LocalDateTime dateTime;
    private final ZoneOffset offset;
}
```
OffsetDateTime: 시간대를 고려한 날짜와 시간을 표현할 때 사용한다. 여기에는 타임존은 없고, UTC로 부터의 시간대 차이인 고정된 오프셋만 포함한다.
- 예) 2021-07-01T12:30:45.123+09:00
- ZondId가 없으므로 썸머타임이 적용되지 않는다.

## Instant - 기계 중심의 시간
Instant는 UTC를 기준으로 하는, 시간의 한 지점을 나타낸다. Instant는 날짜와 시간을 나노초 정밀도로 표현하며,
1970년 1월 1일 0시 0분 0초(UTC 기준)를 기준으로 경과한 시간으로 계산된다.
쉽게 이야기해서 Instant 내부에는 초 데이터만 들어있다. (나노초 포함)
따라서 날짜와 시간을 계산에 사용할 때는 적합하지 않다.

### Instant 클래스
```java
public class Instant {
    private final long second; // 초
    private final int nano; // 나노초
}
```
- UTC 기준 1970년 1월 1일 0시 0분 0초라면 second는 0이다.
- UTC 기준 1970년 1월 1일 0시 0분 10초라면 second는 10이다.
- UTC 기준 1970년 1월 1일 0시 1분 0초라면 second는 60이다.

### Instant 특징
- 장점:
  - 시간대 독립성: UTC 기준으로 시간을 저장하므로 시간대에 대한 고민이 없다. 이는 전 세계 어디서나 동일한 시점을 가리키는데 유용하다.
  - 고정된 기준점: 모든 Instant는 UTC 기준으로 표현되므로 시간 계산 및 비교가 명확하고 일관된다.
- 단점
  - 사용자 친화적이지 않음: Instant는 기계적인 시간 처리에는 적합하지만, 사람이 읽고 이해하기에는 직관적이지 않다.
  - 시간대 정보 부재: Instant는 시간대 정보가 포함되어 있지 않아, 특정 지역의 날짜와 시간으로 변환하려면 추가적인 작업이 필요하다.
- `일반적으로 날짜와 시간을 사용할 때는 LocalDateTime, ZonedDateTime 등을 사용하면 된다. Instant는 기계적인 시간 처리가 필요할 때 사용한다.`

## Period와 Duration
- `Period`: 두 날짜 사이의 간격을 년, 월, 일 단위로 나타낸다.
- `Duration`: 두 시간 사이의 간격을 시, 분, 초(나노초) 단위로 나타낸다.

### Period 클래스
```java
public class Period {
    private final int years;
    private final int months;
    private final int days;
}
```

### Duration 클래스
```java
public class Duration {
    private final long seconds;
    private final int nanos;
}
```

## 날짜와 시간 문자열 포맷팅과 파싱
- 포맷팅: 날짜와 시간 데이터를 원하는 포맷의 문자열로 변경하는 것, Date -> String
- 파싱: 문자열을 날짜와 시간 데이터로 변경하는 것, String -> Date