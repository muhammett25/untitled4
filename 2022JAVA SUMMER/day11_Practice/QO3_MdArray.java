package day11_Practice;

public class QO3_MdArray {
    public static void main(String[] args) {
        int arr[][]={{1,3,6}, {2,8},{5,7,9,14}};
        ciftlerTopla(arr);
    }

    private static int ciftlerTopla(int[][] arr) {
        int toplam=0;
        for (int [] each1 :arr){
            for (int each2:each1){

                if (each2%2==0){
                    toplam+=each2;
                }
            }
        }
        return toplam;
    }

}
