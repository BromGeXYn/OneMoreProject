public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getINSTANCE();
        Singleton singleton2 = Singleton.getINSTANCE();

        System.out.println(singleton == singleton2);

    }
}
