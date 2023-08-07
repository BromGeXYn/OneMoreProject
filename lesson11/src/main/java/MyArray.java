import java.util.Arrays;

public class MyArray <T> {
    private int size;
    private Object[] array;
    public MyArray() {
        this.size = 10;
        array = new Object[size];
    }
    public MyArray(int size) {
        this.size = size;
        array = new Object[size];
    }
    public void add(T element) {
        if (array[array.length -1] != null) {
            Object[] objects = Arrays.copyOf(array, array.length + 1);
            array = objects;
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] == null){
                array[i] = element;
                break;
            }
        }
    }
    public void remove(int i) {
        array[i] = null;
    }
    @SuppressWarnings("unchecked")    // не знаю что это, нашел когда гуглил предупреждение,
    public T getElem(int index) {     //которое идея кидала
        return (T) array[index];
    }
    public void clearArr(){
        for(Object t : array){
            t = null;
        }
    }
    public boolean isContains(T t){
        for(Object o: array) {
            if (t.equals(o)){
                return true;
            }
        }
        return false;
    }
    public void printArray(){
        System.out.println(Arrays.toString(array));
    }
}
