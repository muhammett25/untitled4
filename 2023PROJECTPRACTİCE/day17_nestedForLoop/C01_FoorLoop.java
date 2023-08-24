package day17_nestedForLoop;

public class C01_FoorLoop {
    public static void main(String[] args) {


        String input = "taka tuka";

        tekrarsizYap(input);

    }

    private static void tekrarsizYap(String input) {
     String benzersizInput="";

     String islenecekKelime=input.replaceAll("\\W","");

        System.out.print(input.substring(0,1));
        benzersizInput+=islenecekKelime.substring(0,1);


        for (int i = 0; i < islenecekKelime.length() ; i++) {

           if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
               System.out.print(", "+ islenecekKelime.substring(i,i+1));
               benzersizInput+=islenecekKelime.substring(i,i+1);
           }

        }
        System.out.println("");
        System.out.println("inpt: " + input);
        System.out.println("benzersiz input:" + benzersizInput);

    }
}
