package day37_overriding;

public class FSupra extends EToyota {

    void yakit(){
        System.out.println("Supra benzin kullanir");
    }

    @Override
    void motor() {
        super.motor();
    }
}
