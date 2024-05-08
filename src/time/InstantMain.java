package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

    public static void main(String[] args) {
        // 생성
        Instant now = Instant.now();// UTC 기준
        System.out.println("now = " + now); // 지금으로부터 -9 시간: UTC 기준이기 때문

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart); // 1970-01-01T00:00:00Z: UTC 기준으로부터 0초를 더한것

        // 계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later); // 1970-01-01T01:00:00Z: UTC 기준으로부터 3600초를 더한것

        // 조회
        long epochSecond = later.getEpochSecond();
        System.out.println("epochSecond = " + epochSecond); // 3600
    }
}
