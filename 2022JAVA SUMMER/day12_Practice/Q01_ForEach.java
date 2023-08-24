package day12_Practice;

public class Q01_ForEach {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        for (int each :arr) {
            if (each%2==0) {
                System.out.println(each + " ");
            }
        }

        System.out.println();
        System.out.println("tek sayilar");
        for (int item:arr){
            if(item%2!=0) {
                System.out.println(item + " ");
            }

        }
    }
}
