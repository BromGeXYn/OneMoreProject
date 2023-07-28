import java.io.*;

public class FileProcessor {
    public static void fileProcessing(String address) {
        try (LineNumberReader reader = new LineNumberReader((new FileReader(address)));
             Writer writer1 = new FileWriter("D:\\Java\\OneMoreProject\\lesson10\\src\\main\\java\\validNumbers.txt");
             Writer writer2 = new FileWriter("D:\\Java\\OneMoreProject\\lesson10\\src\\main\\java\\invalidNumbers.txt")){

            String number = reader.readLine();

            while (number != null){
                if ((number.length() == 15) && ((number.startsWith("docnum")) || (number.startsWith("contract")))) {
                    writer1.write(number + "\n");
                    System.out.println(number + " - Correct number.");
                } else if (number.length() != 15){
                    writer2.write(number + " - Document number must be 15 characters!\n");
                    System.out.println(number + " - Incorrect number.");
                } else if ((!number.startsWith("docnum")) || (!number.startsWith("contract"))){
                    writer2.write(number + " - Document number must starts with \"docnum\" or \"contract\"!\n");
                    System.out.println(number + " - Incorrect number.");
                }
                number = reader.readLine();
            }
        } catch (IOException e){
            System.out.println("File does not exist.");
        }
    }
}
