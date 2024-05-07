package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println("현재 날짜와 시간: " + nowDt);
        System.out.println("지정 날짜와 시간: " + ofDt);
        
        // 날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("날짜: " + localDate);
        System.out.println("시간: " + localTime);

        // 날짜와 시간 합치기
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("합친 날짜와 시간: " + localDateTime);

        // 계산 (불변)
        LocalDateTime plusDt = ofDt.plusDays(1000);
        System.out.println("1000일 후: " + plusDt);
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println("1년 후: " + ofDtPlus1Year);

        // 비교
        System.out.println("현재 시간이 지정 시간보다 이전인가? " + nowDt.isBefore(ofDt));
        System.out.println("현재 시간이 지정 시간보다 이후인가? " + nowDt.isAfter(ofDt));
        System.out.println("현재 시간이 지정 시간과 같은가? " + nowDt.isEqual(ofDt));
    }
}
