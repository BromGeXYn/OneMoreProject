public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+375291234567", "Xiaomi", 230);
        Phone phone2 = new Phone("+375449876543", "Samsung", 200);
        Phone phone3 = new Phone("+375331245689", "Apple", 250);
        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());
        phone1.receiveCall("Angelina Jolie");
        phone2.receiveCall("Bill Gates");
        phone3.receiveCall("Keanu Reeves");
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        phone1.receiveCall("Angelina Jolie", "+375296662288");
        phone2.receiveCall("Bill Gates", "+375441000000");
        phone3.receiveCall("Keanu Reeves", "+375255869472");
        phone1.sendMessage("+375333335599", "+375252226655", "+375296667788", "+375449922888", "+375297832322");
    }
}
