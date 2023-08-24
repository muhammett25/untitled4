package day26_Constructor;

public class KamyonRunner {
    public static void main(String[] args) {
        Kamyon kamyon1=new Kamyon();
        System.out.println("kamyon1 ozellikleri " + kamyon1.toString());

        Kamyon kamyon2=new Kamyon("Mercedes","2140",2005,500000);
        System.out.println("Kamyon bilgileri" + kamyon2);

        Kamyon kamyon3=new Kamyon("Man","as900",2007,400000);
        System.out.println("Kamyon bilgileri" + kamyon3);

        Kamyon kamyon4=new Kamyon("Scania","s540");
        System.out.println("Kamyon bilgileri" + kamyon4);





    }
}
