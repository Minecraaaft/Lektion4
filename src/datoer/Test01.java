package datoer;

public class Test01 {

    public static void main(String[] args) {
        Dato d1 = new Dato(2015, 9, 8);
        Dato d2 = new Dato(1999,1,2);
        System.out.println(d1.danishText());
        System.out.println(d2.iso());

    }

}