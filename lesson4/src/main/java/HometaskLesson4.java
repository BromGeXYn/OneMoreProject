import java.util.Arrays;
import java.util.Scanner;

public class HometaskLesson4 {
    public static void main(String[] args) {
        HometaskLesson4 hometaskLesson4 = new HometaskLesson4();
        //0. Создайте массив целых чисел. Напишете программу, которая выводит
        //сообщение о том, входит ли заданное число в массив или нет.
        //Пусть число для поиска задается с консоли (класс Scanner).
        Scanner scanner = new Scanner(System.in);
        int numToFind = scanner.nextInt();
        int[] arr1 = new int[]{5,2,6,8,3,5,9,12,45,1};
        int index = Arrays.binarySearch(arr1, numToFind);
        if (index >= 0) System.out.println("Заданное число " + numToFind + " входит в массив.");
        else System.out.println("Заданное число " + numToFind + " не входит в массив.");

        //1. Создайте массив целых чисел. Удалите все вхождения заданного
        //числа из массива.
        //Пусть число задается с консоли (класс Scanner). Если такого числа нет -
        //выведите сообщения об этом.
        //В результате должен быть новый массив без указанного числа.
        int[] arr2 = new int[]{5,2,6,8,3,5,9,12,45,1};
        int numToDel = scanner.nextInt();
        int[] newArray = hometaskLesson4.newArray(arr2, numToDel);
        if (newArray != null) System.out.println(Arrays.toString(newArray));

//        2. Создайте и заполните массив случайным числами и выведете
//        максимальное, минимальное и среднее значение.
//        Для генерации случайного числа используйте метод Math.random().
//        Пусть будет возможность создавать массив произвольного размера.
//        Пусть размер массива вводится с консоли.
        int arrSize = scanner.nextInt();
        int[] arr3 = new int[arrSize];
        hometaskLesson4.minMaxMed(arr3);

        //3. Создайте 2 массива из 5 чисел.
        //Выведите массивы на консоль в двух отдельных строках.
        //Посчитайте среднее арифметическое элементов каждого массива и
        //сообщите, для какого из массивов это значение оказалось больше (либо
        //сообщите, что их средние арифметические равны).

        int[] array1 = new int[]{1,2,3,4,5};
        int[] array2 = new int[]{6,7,8,9,10};
        int summ1 = 0;
        int summ2 = 0;
        for (int i : array1) summ1 += i;
        for (int i : array2) summ2 += i;
        int medVal1 = summ1 / array1.length;
        int medVal2 = summ2 / array2.length;
        if (summ1 > summ2) System.out.println("Среднее значение элементов первого массива больше.");
        else if (summ1 < summ2) System.out.println("Среднее значение второго массива больше.");
        else System.out.println("Средние значения чисел массива равны.");
    }
    public int[] newArray(int[] array, int numToDel){   //удаляем из массива переданное число
        int count = 0;
        for (int i : array){
            if (i == numToDel) count++;    //определяем количество вхождений переданного числа в массив
        }
        if (count == 0){
            System.out.println("Заданное число не входит в переданный массив.");
            return null;
        }
        int[] newArray = new int[array.length - count]; //создаем новый массив нужного размера
        int i = 0;
        int j = 0;
        for ( ; i < array.length ; ){
            if (array[i] == numToDel){
              i++;
              continue;
            }
            newArray[j] = array[i];
            j++;
            i++;
        }
        return newArray;
    }

    public void minMaxMed (int[] arr3){  ////находим минимальное, максимальное и среднее значение
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int summ = 0;
        for (int i = 0; i < arr3.length; i++){
            arr3[i] = (int)(Math.random() * 1000);
            if (arr3[i] > max) max = arr3[i];
            if (arr3[i] < min) min = arr3[i];
            summ += arr3[i];
        }
        System.out.println("Максимально число в массиве равно " + max);
        System.out.println("Минимальное число в массиве равно " + min);
        System.out.println("Среднее значение равно " + summ / arr3.length);
    }
}
