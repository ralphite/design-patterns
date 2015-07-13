package strategy;

/**
 * Created by ralph on 7/13/15 2:40 PM.
 */
public class WriteLengthyCode implements CodeStrategy {
    @Override
    public void code() {
        System.out.println("Self explainable code rocks.");
    }
}
