package day33_encupsulation;

public class Ogretmen {

   private String isim;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getBrins() {
        return brins;
    }

    public void setBrins(String brins) {
        this.brins = brins;
    }

    private String soyisim;
   private String brins;


}
