package day12_OkulProje;

public class Ogrenci extends Kisi{// cons kontrol et
        private String ogrenciNo;
        private String sinif;

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrenciNo, String sinif) {
            super(adSoyad, kimlikNo, yas);
            this.ogrenciNo = ogrenciNo;
            this.sinif = sinif;
        }
    public  Ogrenci(){

        }

        public String getOgrenciNo() {
            return ogrenciNo;
        }// parenttakiler zaten ulasılabilir sadece bu classdakileri public yapıyoruz

        public void setOgrenciNo(String ogrenciNo) {
            this.ogrenciNo = ogrenciNo;
        }

        public String getSinif() {
            return sinif;
        }

        public void setSinif(String sinif) {
            this.sinif = sinif;
        }

        @Override
        public String toString() {
            return "Ogrenci{" +
                    "ogrenciNo='" + ogrenciNo + '\'' +
                    ", sinif='" + sinif + '\'' +
                    '}'+super.toString();
        }
}
