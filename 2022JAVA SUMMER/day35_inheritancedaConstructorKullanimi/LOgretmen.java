package day35_inheritancedaConstructorKullanimi;

public class LOgretmen {
    LOgretmen() {
        super();
        System.out.println("Logretmen parametresiz cons");
    }
    LOgretmen(String isim){
        this();
        System.out.println("Logretmen parametresiz cons");
    }
}
