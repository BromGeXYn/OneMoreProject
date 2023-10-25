import org.lesson28.RaceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        RaceImpl bean = context.getBean(RaceImpl.class);
        bean.startRace();
    }

}
