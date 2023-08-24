package day31_TimeFormatter_varags;

public class C04_VarragsIleEnuzunKelimeyiYazdirma {
    public static void main(String[] args) {
        enUzunKelimeyiYazdir( "Ali", "Ayse", "Ismail", "Ahmet");

    }

    private static void enUzunKelimeyiYazdir(String... kelime) {
        String enUzunKelime=kelime[0];
        for (String each: kelime
             ) {
            if (each.length() >enUzunKelime.length()) {
                enUzunKelime=each;

            }

        }
        System.out.println("Girilen kelimelerin en uzunu:" + enUzunKelime);
    }

}
