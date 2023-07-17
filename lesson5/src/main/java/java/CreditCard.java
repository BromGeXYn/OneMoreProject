public class CreditCard {
    private int countNumber;
    private int countValue;

    public CreditCard(int countNumber, int countValue) {
        this.countNumber = countNumber;
        this.countValue = countValue;
    }

    public void plusCount(int summa){
        countValue = countValue + summa;
    }
    public void minusCount(int summa){
        countValue = countValue - summa;
    }
    public void printCountInfo(){
        System.out.println("Current account # " + countNumber + " status is: " + countValue);
    }

}
