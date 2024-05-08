package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("YEAR = " + dt.get(ChronoField.YEAR)); // 2030
        System.out.println("MONTH_OF_YEAR = " + dt.get(ChronoField.MONTH_OF_YEAR)); // 1
        System.out.println("DAY_OF_MONTH = " + dt.get(ChronoField.DAY_OF_MONTH)); // 1
        System.out.println("HOUR_OF_DAY = " + dt.get(ChronoField.HOUR_OF_DAY)); // 13
        System.out.println("MINUTE_OF_HOUR = " + dt.get(ChronoField.MINUTE_OF_HOUR)); // 30
        System.out.println("SECOND_OF_MINUTE = " + dt.get(ChronoField.SECOND_OF_MINUTE)); // 59

        System.out.println("편의 메서드 제공");
        System.out.println("YEAR = " + dt.getYear()); // 2030
        System.out.println("MONTH_OF_YEAR = " + dt.getMonthValue()); // 1
        System.out.println("DAY_OF_MONTH = " + dt.getDayOfMonth()); // 1
        System.out.println("HOUR_OF_DAY = " + dt.getHour()); // 13
        System.out.println("MINUTE_OF_HOUR = " + dt.getMinute()); // 30
        System.out.println("SECOND_OF_MINUTE = " + dt.getSecond()); // 59

        System.out.println("편의 메서드에 없음");
        System.out.println("MINUTE_OF_DAY = " + dt.get(ChronoField.MINUTE_OF_DAY)); // 810
        System.out.println("SECOND_OF_DAY = " + dt.get(ChronoField.SECOND_OF_DAY)); // 48659

    }
}
