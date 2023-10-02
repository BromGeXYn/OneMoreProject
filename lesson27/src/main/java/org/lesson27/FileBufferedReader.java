package org.lesson27;

public class FileBufferedReader extends Decorator{
    public FileBufferedReader(FileStream fileDecorator) {
        super(fileDecorator);
    }

    @Override
    public void read() {
        fileDecorator.read();
        System.out.println("Reading from buffer...");
    }

}
