package day19_Scope;

public class C02_ClassVariables {

    public static void main(String[] args) {

        C01_ClassVariables.staticMethod();
        System.out.println(C01_ClassVariables.statSayi);
        System.out.println(C01_ClassVariables.degersizStaticVar);

        C01_ClassVariables obje1=new C01_ClassVariables();
        obje1.staticOlmayanMethod();
        System.out.println(obje1.isim);
        System.out.println(obje1.degersizInstanceVariable);

        System.out.println(C01_ClassVariables.statSayi);
    }
}
