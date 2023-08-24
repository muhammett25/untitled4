package day19_Scope;

public class C01_ClassVariables {

    static int statSayi=10;
    String isim="Mehmet";

    static int degersizStaticVar;
    int degersizInstanceVariable;

    public static void main(String[] args) {
        System.out.println(statSayi);
        statSayi=20;
        System.out.println(statSayi);
        C01_ClassVariables obje1= new C01_ClassVariables();
        obje1.staticOlmayanMethod();
        System.out.println(statSayi);


    }
    public static void staticMethod() {
        System.out.println(statSayi);

    }
    public void staticOlmayanMethod(){
        System.out.println(statSayi);
        statSayi=20;

    }
}
