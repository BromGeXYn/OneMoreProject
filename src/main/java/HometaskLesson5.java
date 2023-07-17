public class HometaskLesson5 {
    public static void main(String[] args) {
        //1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
        CreditCard card1 = new CreditCard(123456, 2000);
        CreditCard card2 = new CreditCard(345678, 1000);
        CreditCard card3 = new CreditCard(456789, 10000);
        card1.plusCount(500);
        card2.plusCount(700);
        card3.minusCount(1000);
        card1.printCountInfo();
        card2.printCountInfo();
        card3.printCountInfo();
        //2. Создать класс для описания компьютера
        Computer computer1 = new Computer( 500, "Standart");
        HDD hdd1 = new HDD("WD", 8096, true);
        RAM ram1 = new RAM("Kingston", 64);
        Computer computer2 = new Computer( 5000, "Megatron9000", hdd1, ram1);
        computer1.printCompInfo();
        computer2.printCompInfo();
    }
}
