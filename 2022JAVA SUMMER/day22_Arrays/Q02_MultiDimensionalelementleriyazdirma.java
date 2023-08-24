package day22_Arrays;

public class Q02_MultiDimensionalelementleriyazdirma {
    public static void main(String[] args) {
        int[][] sayilar= {{1,5,6,9},{2,5},{3,1,6}};
        elmenleriYazdir(sayilar);
    }

    private static void elmenleriYazdir(int[][] sayilar) {
        for (int i = 0; i < sayilar.length ; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                System.out.print(sayilar[i][j]+ " ");

            }
        }
    }
}
