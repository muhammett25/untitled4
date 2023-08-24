package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {


        LocalTime time1=LocalTime.now();
        System.out.println(time1);

        Thread.sleep(3000);
        time1=LocalTime.now();

        System.out.println(time1);

        System.out.println(time1.getSecond());

        System.out.println(time1.plusSeconds(100000));

        System.out.println(time1.minusMinutes(200));

        System.out.println(time1.withHour(3));
    }
}
