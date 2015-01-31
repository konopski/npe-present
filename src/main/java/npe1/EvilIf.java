package npe1;

public class EvilIf {

    static void evilIf(Boolean param) {
        if(param = null) {
            System.out.println("jin");
        } else {
            System.out.println("jang");
        }
    }

    public static void main(String[] args) {
        evilIf(false);
    }

}
