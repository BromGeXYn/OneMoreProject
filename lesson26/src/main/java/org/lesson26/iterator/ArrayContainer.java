package org.lesson26.iterator;

public class ArrayContainer implements Container{
    String[] array = {"text1", "text2", "text3"};

    @Override
    public Iterator getIterator() {
        return new ArrayIterator();
    }
    class ArrayIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if (index < array.length) {
                return true;
            } else {
                return false;
            }
        }
        @Override
        public Object next() {
            if (hasNext()){
                return array[index++];
            }
            return null;
        }
    }
}
