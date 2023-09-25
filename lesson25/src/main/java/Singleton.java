public class Singleton {

    private static Singleton INSTANCE;
    private Singleton(){
    }
    public static Singleton getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
