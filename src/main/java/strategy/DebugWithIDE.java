package strategy;

/**
 * Created by ralph on 7/13/15 2:44 PM.
 */
public class DebugWithIDE implements DebugStrategy {
    @Override
    public void debug() {
        System.out.println("IDE rocks.");
    }
}
