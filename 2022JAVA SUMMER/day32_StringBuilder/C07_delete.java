package day32_StringBuilder;

public class C07_delete {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java her zaman guzeldir");
        sb.delete(8,9);
        System.out.println(sb);

        sb.deleteCharAt(8);
        System.out.println(sb);


        int son=sb.length();
        for (int i = 0; i < son; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);
        }
    }
}
