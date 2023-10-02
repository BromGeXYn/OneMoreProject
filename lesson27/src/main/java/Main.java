import org.lesson27.FileBufferedReader;
import org.lesson27.FileStream;
import org.lesson27.FileStreamReader;

public class Main {
    public static void main(String[] args) {
        FileStream fileStream = new FileBufferedReader(new FileStreamReader());
        fileStream.read();
    }
}
