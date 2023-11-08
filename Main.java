import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Double[] ar = {3.0, 1.0};
        Polynomial p = new Polynomial(ar);
        System.out.println("P is:");
        System.out.println(p.toStrange());
        System.out.println("Evaluating p for 5 you get:");
        System.out.println(p.eval(5));
        System.out.println("P plus itself is:");
        System.out.println(p.add(p).toStrange());
        System.out.println("P times itself is:");
        System.out.println(p.multi(p).toStrange());
       

    }
    
}
