package day26_Constructor;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogretmen1=new Ogretmen();
        System.out.println("Ogretmen 1" + ogretmen1);

        Ogretmen ogretmen2=new Ogretmen( "Emre", "Akdogan", "1/1/2001", "Matematik", "Hukuk" );
        System.out.println("Ogretmen 2" + ogretmen2);

        Ogretmen ogretmen3=new Ogretmen("Cavidan", "Kabinkara", "1/1/1992");
        System.out.println("Ogretmen 3" + ogretmen3);
        
    }
}
