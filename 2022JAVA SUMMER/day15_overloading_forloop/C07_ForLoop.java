package day15_overloading_forloop;

public class C07_ForLoop {
    public static void main(String[] args) {


        C04_ForLoop.terstenYazdir("Zekereiya");

        for (int i = 100; i >=1 ; i--) {
            if (i%8==0){
                System.out.println(i+"");
            }
        }
    }
}
