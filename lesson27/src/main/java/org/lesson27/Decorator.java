package org.lesson27;

abstract class Decorator implements FileStream{
    FileStream fileDecorator;

    public Decorator(FileStream fileDecorator) {
        this.fileDecorator = fileDecorator;
    }
    public abstract void read();
}
