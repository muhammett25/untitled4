package day30_immutable_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);
        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.getDayOfWeek());
        System.out.println(tarih.getDayOfMonth());
        System.out.println(tarih.isLeapYear());

        LocalDate tarih2= LocalDate.of(2001, 5, 15);
        System.out.println(tarih2);

        LocalDate tarih3= LocalDate.of(1999, Month.JANUARY, 10);
        System.out.println(tarih3);

        System.out.println(tarih.plusDays(100));
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12));
        System.out.println(tarih.minusWeeks(20));
        System.out.println(tarih.minusDays(100).minusMonths(5));
        System.out.println(tarih2);


    }
}