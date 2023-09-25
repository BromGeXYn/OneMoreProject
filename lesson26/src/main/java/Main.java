import org.lesson26.abstractFactory.CarsFactory;
import org.lesson26.abstractFactory.VwFactory;
import org.lesson26.iterator.ArrayContainer;
import org.lesson26.iterator.Iterator;
import org.lesson26.observer.NewsChannel;
import org.lesson26.observer.Observer;
import org.lesson26.observer.Subscriber;

public class Main {
    public static void main(String[] args) {
        //abstract factory - если честно, подсмотрел пример на хабре, но вроде с большего понял
        CarsFactory factory = new VwFactory();
        factory.createSedan();
        factory.createMinivan();
        //iterator
        ArrayContainer container = new ArrayContainer();
        Iterator iterator = container.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //observer
        NewsChannel newsChannel = new NewsChannel();
        newsChannel.addNews("First news");
        newsChannel.addNews("Second news");
        Observer firstSubscriber = new Subscriber("subscriber1");
        newsChannel.addObserver(firstSubscriber);
        newsChannel.addNews("Some more news");
    }
}
