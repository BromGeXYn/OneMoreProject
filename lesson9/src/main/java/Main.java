import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String docNum = scanner.nextLine();
        FormatStringService.printFirst8Numbers(docNum);
        FormatStringService.switchLettersToAsterisk(docNum);
        FormatStringService.printLetters(docNum);
        FormatStringService.printLettersSB(docNum);
        FormatStringService.isContains(docNum, "ABc");
        FormatStringService.isBeginsWith(docNum, "555");
        FormatStringService.isEndsWith(docNum, "1a2b");
    }
}
