package enums;

import java.util.Arrays;

public class EnumMethod {

    public static void main(String[] args) {

        // 모든 enum 반환
        Grade[] values = Grade.values();
        System.out.println("Values of Grade enum:" + Arrays.toString(values)); // Values of Grade enum:[BASIC, GOLD, PLATINUM]

        // 순서 반환
        for (Grade value: values) {
            System.out.println(value.name() + "/" + value.ordinal());
            /*
            BASIC/0
            GOLD/1
            PLATINUM/2
             */
        }

        // String -> enum 변환
        String input = "GOLD";
        Grade grade = Grade.valueOf(input);
        System.out.println("Grade of " + input + ":" + grade); // Grade of GOLD:GOLD
    }
}
