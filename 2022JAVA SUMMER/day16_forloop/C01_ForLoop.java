package day16_forloop;

public class C01_ForLoop {
    public static void main(String[] args) {
        // verilen bir pozitif tam sayinin
// tam bolenlerini yazdiralim

        int input=120;

        for (int i = 1; i <=input ; i++) {

            if (input%i==0){
                System.out.println(i +" ");


            }

        }



    }
}
