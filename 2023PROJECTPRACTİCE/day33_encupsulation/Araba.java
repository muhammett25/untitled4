package day33_encupsulation;

public class Araba {

    String marka="Marka belirtilmedi";


    public void setModel(String model) {
        this.model = model;
    }

    private String model="Model belirtilmedi";

    public String getYakit() {
        return yakit;
    }

    private String yakit="Yakit belirtilmedi";

}
