package strategy;

/**
 * Created by ralph on 7/13/15 2:43 PM.
 */
public class DebugWithPdb implements DebugStrategy {
    @Override
    public void debug() {
        System.out.println("PDB rocks.");
    }
}
