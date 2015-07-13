package strategy;

/**
 * Created by ralph on 7/13/15 2:44 PM.
 */
public class JavaDeveloper extends Developer {
    public JavaDeveloper() {
        this.setDebugStrategy(new DebugWithIDE());
        this.setCodeStrategy(new WriteLengthyCode());
    }
}
