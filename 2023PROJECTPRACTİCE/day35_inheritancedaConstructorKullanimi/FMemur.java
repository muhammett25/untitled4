package day35_inheritancedaConstructorKullanimi;

public class FMemur extends EMuahesebe {
    FMemur(){
        System.out.println("Memur parametresiz cons");

    }
    FMemur(String isim){

        System.out.println("Memur paramtreli cons");
    }

    public static void main(String[] args) {
        FMemur mmr1=new FMemur();
    }
}
