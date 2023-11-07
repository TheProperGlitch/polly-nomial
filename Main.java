import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Double[] input = {1.0, 3.0};
        Double[] toAdd = {1.0, 2.0, 3.0};
        Polynomial polly = new Polynomial(input);
        Polynomial adding = new Polynomial(toAdd);
        Polynomial together = adding.add(polly);
        Polynomial multi = adding.multi(polly);
        System.out.println("Polly is:");
        System.out.println(polly.toStrange());
        System.out.println("Adding is:");
        System.out.println(adding.toStrange());
        System.out.println("Polly plus Adding is:");
        System.out.println(together.toStrange());
        System.out.println("Polly times Adding is:");
        System.out.println(multi.toStrange());
    }
    
}
