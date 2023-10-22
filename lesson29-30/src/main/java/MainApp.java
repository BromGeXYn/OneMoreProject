import org.lesson29_30.RaceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {

        ApplicationContext context = new AnnotationConfigApplicationContext("org.lesson29_30");
        RaceImpl race = context.getBean(RaceImpl.class);
        race.startRace();

    }

}
