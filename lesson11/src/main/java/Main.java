import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ///////////////задание 2
        int[] num1 = new int[]{4,7,32,2,32,1,32,32,1};
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(4,7,32,2,32,1,32,32,1));
        int j = countArrayElements(num1);
        System.out.println(j);
        int i = countArrayListElements(nums2);
        System.out.println(i);
        ////////////задание 1
        MyArray<String> array = new MyArray<String>(10);
        array.add("string1");
        array.add("string2");
        array.add("string3");
        array.add("string4");
        array.add("string5");
        array.add("string6");
        array.add("string7");
        array.add("string8");
        array.add("string9");
        array.add("string10");
        array.add("string11");
        String elem = array.getElem(10);
        System.out.println(elem);
        boolean string11 = array.isContains("string11");
        System.out.println(string11);
        array.remove(10);
        array.printArray();
    }
    ////////////////////////////////////////////////////////////////////
    public static int countArrayElements(int[] array){
        int maxCount = 1;
        int count = 1;
        int maxCountNumber = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] == array[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > maxCount){
                maxCountNumber = array[i];
            }
        }
        return maxCountNumber;
    }
    public static int countArrayListElements(List<Integer> numbers) {
        int maxCount = 1;
        int maxCountNumber = 0;
        for (Integer number : numbers){
            int count = Collections.frequency(numbers, number);
            if (count > maxCount){
                maxCount = count;
                maxCountNumber = number;
            }
        }
        return maxCountNumber;
    }

}
