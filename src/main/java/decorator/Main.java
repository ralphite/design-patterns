package decorator;

/**
 * Created by ralph on 7/16/15 12:21 PM.
 */
public class Main {
    public static void main(String[] args) {
        CoffeeDecoratee coffee = new CoffeeDecoratee();
        System.out.println(coffee);

        coffee = new Milk(coffee);
        System.out.println(coffee);

        coffee = new Sugar(coffee);
        System.out.println(coffee);
    }
}
