package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt); // 2018-01-01T13:30:59

        LocalDateTime changeDt1 = dt.with(ChronoField.YEAR, 2020);
        System.out.println("changeDt1 = " + changeDt1); // 2020-01-01T13:30:59

        LocalDateTime changeDt2 = dt.withYear(2020);
        System.out.println("changeDt2 = " + changeDt2); // 2020-01-01T13:30:59

        // TemporalAdjuster 사용
        // 다음주 금요일
        LocalDateTime with1 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("기준 날짜: " + dt);
        System.out.println("다음 금요일: " + with1);

        // 이번 달의 마지막 일요일
        LocalDateTime with2 = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("이번 달의 마지막 일요일: " + with2);

    }
}
