package time;

import java.time.ZoneId;

public class ZoneIdMain {

    public static void main(String[] args) {
        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneId);
            /*
            Asia/Aden
            America/Cuiaba
            Etc/GMT+9
            Etc/GMT+8
            Africa/Nairobi
            America/Marigot
            ...
            Etc/UTC
             */
        }
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + ":" + zoneId.getRules());
            /*
            Asia/Seoul:ZoneRules[currentStandardOffset=+09:00]
            ...
            Etc/UTC:ZoneRules[currentStandardOffset=Z]
             */
        }
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("System default zoneId:" + zoneId); // 운영체제 기반 시스템의 기본 시간대
    }
}
