package Day11_indexOf;

public class C05_endsWith {
    public static void main(String[] args) {

        String input = "fatih@gmail.com";

        if(input.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresi giriniz");
        }else if(input.endsWith("@gmail.com")){
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println("Lutfen yazinizi kontrol edin");
        }
    }
}
