package day30_immutable_date;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();

        System.out.println(tarihSaat);

        System.out.println(tarihSaat.plusMonths(3).plusHours(3).plusHours(100));

        System.out.println(tarihSaat.minusDays(100).plusHours(100));
        System.out.println(tarihSaat.toLocalDate());
    }
}
