package Day11_indexOf;

public class C06_startsWith {
    public static void main(String[] args) {
       String input="Java gun gectikce guzellesiyor";
        System.out.println(input.startsWith("3"));

        System.out.println(input.startsWith(""));
        System.out.println(input.startsWith("gun", 5));
    }
}
