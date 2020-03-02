package Projects;

public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                //double-checked locking singleton
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
