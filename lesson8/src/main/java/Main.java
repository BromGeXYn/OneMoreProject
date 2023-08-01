import javax.swing.text.Position;

public class Main {
    public static void main(String[] args) {
        Director director1 = new Director("Vasiliy", "Pupkin", 5);
        Director director2 = new Director("Egor", "Balalaikin", 7);
        Worker worker1 = new Worker("Fedor", "Sumkin", 2);
        Worker worker2 = new Worker("Pyotr", "Hryapkin", 4);
        Worker worker3 = new Worker("Boris", "Britva", 10);
        director1.addSubWorker(worker1);
        director1.addSubWorker(worker2);
        director1.addSubWorker(director2);
        director2.addSubWorker(worker3);
        System.out.println(director1.toString());
        System.out.println(worker1.toString());
        FindWorkerService service = new FindWorkerService();
        boolean isWorker = service.findWorker(director1, "Britva");
        System.out.println(isWorker);

    }
}
