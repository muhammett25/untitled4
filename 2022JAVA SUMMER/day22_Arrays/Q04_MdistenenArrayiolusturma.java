package day22_Arrays;

public class Q04_MdistenenArrayiolusturma {
    public static void main(String[] args) {
        int[][] arr={{1,2,3}, {4,5,2}, {6,3}};
        int carpim=1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j==arr[i].length-1) {
                    carpim*=arr[i][j];
                }
            }
        }
        System.out.println("Son elemanlarin carpimi = " + carpim);
    }
}
