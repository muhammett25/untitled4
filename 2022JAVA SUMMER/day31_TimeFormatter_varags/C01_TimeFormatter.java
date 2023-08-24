package day31_TimeFormatter_varags;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("ilk olusturlan tarih:" + tarihSaat);

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("d/MMM/yyyy  HH:mm a");

        System.out.println(dtf.format(tarihSaat));

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd/M/yy  hh:mm a");

        System.out.println(dtf1.format(tarihSaat));


    }
}
