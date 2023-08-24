package day33_encupsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1=new Araba();
        arb1.marka="Toyota";
        System.out.println(arb1.marka);

        arb1.setModel("Supra");
        System.out.println(arb1.getYakit());
    }
}
