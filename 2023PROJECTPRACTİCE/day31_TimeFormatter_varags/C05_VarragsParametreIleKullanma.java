package day31_TimeFormatter_varags;

public class C05_VarragsParametreIleKullanma {
    private static String[] kelime;

    public static void main(String[] args) {
            enUzunKelimeyiYazdir ( 5,"Ali", "Ayse", "Ismail", "Ahmet", "Babayigit");

        }

        private static void enUzunKelimeyiYazdir(int kelimeSayisi, String... kelime){
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

