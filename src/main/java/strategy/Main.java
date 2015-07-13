package strategy;

/**
 * Created by ralph on 7/13/15 2:55 PM.
 */
public class Main {
    public static void main(String[] args) {
        Developer pythonDeveloper = new PythonDeveloper();
        pythonDeveloper.drinkCoffee();
        pythonDeveloper.performDebug();
        pythonDeveloper.performCode();

        System.out.println("--------------");

        Developer javaDeveloper = new JavaDeveloper();
        javaDeveloper.drinkCoffee();
        javaDeveloper.performDebug();
        javaDeveloper.performCode();

        System.out.println("--------------");

        javaDeveloper.setCodeStrategy(new WriteSuccinctCode());
        javaDeveloper.performCode();
    }
}
