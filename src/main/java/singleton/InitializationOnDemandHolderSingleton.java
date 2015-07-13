package singleton;

/**
 * Created by ralph on 7/13/15 3:57 PM.
 */
public class InitializationOnDemandHolderSingleton {
    private static class Holder {  // preferred. simple, fast and thread safe
        // initialized when holder class is loaded
        public static InitializationOnDemandHolderSingleton instance = new InitializationOnDemandHolderSingleton();
    }

    public static InitializationOnDemandHolderSingleton getInstance() {
        return Holder.instance;
    }
}
