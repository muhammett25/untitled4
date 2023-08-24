package Day11_indexOf;

public class C01_indexof {
    public static void main(String[] args) {

        String str= "Java ogrenmek cok guzel";

        System.out.println(str.indexOf('g'));
        System.out.println(str.indexOf('r'));
        System.out.println(str.indexOf('j'));

        System.out.println(str.indexOf("mek"));

        System.out.println(str.indexOf("g",(6+1)));


        int ilke=str.indexOf("e");
        int ikincie= str.indexOf("e", ilke+1);

        if(ikincie==-1){
            System.out.println("verilen str'da 2.e yok");
        }else{
            int ucuncue=str.indexOf("e", ikincie+1);
            if (ucuncue==-1) {
                System.out.println("verilen str'da 3. e yok");

            }else{
                System.out.println("verilen str'daki 3.e'nin index'i : " + ucuncue);
            }

        }

    }
}
