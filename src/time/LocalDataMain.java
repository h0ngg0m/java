package time;

import java.time.LocalDate;

public class LocalDataMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println("오늘 날짜: " + nowDate);

        LocalDate birthDate = LocalDate.of(1990, 3, 15);
        System.out.println("생년월일: " + birthDate);

        // 계산 (불변)
        birthDate.plusDays(10);
        System.out.println("10일 후: " + birthDate); // 불변이기 때문에 바뀌지 않음 -> 10일 후: 1990-03-15
    }
}
