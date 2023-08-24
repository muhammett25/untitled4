package day12_OkulProje;

public class Ogretmen extends Kisi{
    private String sicilNo;
    private String bolum;


    public Ogretmen(){
    }

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(adSoyad, kimlikNo, yas);
        this.sicilNo = sicilNo;
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "sicilNo='" + sicilNo + '\'' +
                ", bolum='" + bolum + '\'' +
                '}'+super.toString();
    }
}
