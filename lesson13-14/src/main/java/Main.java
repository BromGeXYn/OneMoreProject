import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            list.add((int)(Math.random() * 101));
        }
        list.stream()
                .distinct()
                .forEach(num -> System.out.print(num + " "));
        System.out.println();
        list.stream()
                .filter(number -> number % 2 == 0 && number >=7 && number <= 17 )
                .forEach(num -> System.out.print(num + " "));
        System.out.println();
        list.stream()
                .sorted()
                .forEach(num -> System.out.print(num + " "));
        System.out.println();

        List<Integer> collect = list.stream()
                .map(num -> num * 2)
                .toList();
        System.out.println(collect);

        list.stream()
                .sorted()
                .limit(4)
                .forEach(num -> System.out.print(num + " "));
        System.out.println();
        System.out.println(list.stream().distinct().count());
        System.out.println(list.stream().mapToInt(num -> num).average().orElse(0));

        /////////////////////////////////////////////////////////////////////////////
        // Задание 2
        List<String> list2 = List.of("Eduard", "Oleg", "Vadim", "Nikita", "Ilya", "Aliona", "Sergei", "Georgiy",
                "Denis", "Vlad", "Yana", "Nastya", "Aleksei", "Natalia");
        long count = list2.stream()
                .filter(text -> text.equals("Eduard"))
                .count();
        System.out.println(count);
        list2.stream()
                .filter(text -> text.startsWith("a") || text.startsWith("A"))
                .forEach(System.out::println);

        list2.stream()
                .sorted()
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("Empty"));
    }
}
