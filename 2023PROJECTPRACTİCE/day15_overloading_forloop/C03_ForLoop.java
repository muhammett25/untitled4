package day15_overloading_forloop;

public class C03_ForLoop {
    public static void main(String[] args) {
        int toplam=0;


        for (int i = 1; i <=5 ; i++) {

            toplam+=i;
        }
        System.out.println("toplam : " + toplam);
        for (int i = 10; i <=20; i++) {
            toplam+=i;

        }
        System.out.println("10-20 arasi toplam :" + toplam);


        toplam=0;

        for (int i = 30; i <=50 ; i+=2) {

        }
        System.out.println("30-50 arasi cift sayilarin toplam :" + toplam);

        for (int i = 30; i <=50 ; i++) {
            if (i%2==0){
                toplam+=i;
            }
        }
        System.out.println("30-50 arasi cift sayilarin toplam : " + toplam);

        for (int i = 1500; i <=1600 ; i++) {
            if(i%7==0){
                toplam+=i;

            }

        }
        System.out.println("1500-16000 arasi yedi ile bolunebilen sayilarin toplam :\" + toplam");
    }
}
