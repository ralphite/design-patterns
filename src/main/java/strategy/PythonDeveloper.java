package strategy;

/**
 * Created by ralph on 7/13/15 2:54 PM.
 */
public class PythonDeveloper extends Developer {
    public PythonDeveloper() {
        this.setCodeStrategy(new WriteSuccinctCode());
        this.setDebugStrategy(new DebugWithPdb());
    }
}
