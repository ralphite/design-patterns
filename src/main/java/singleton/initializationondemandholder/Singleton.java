package singleton.initializationondemandholder;

/**
 * Created by ralph on 7/13/15 3:57 PM.
 */
public class Singleton {
    private static class Holder {  // preferred. simple, fast and thread safe
        public static Singleton instance = new Singleton();  // initialized when holder class is loaded
    }

    public static Singleton getInstance() {
        return Holder.instance;
    }
}
