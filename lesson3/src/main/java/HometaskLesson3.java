import java.util.Scanner;

public class HometaskLesson3 {
    public static void main(String[] args) {
        //1. Написать программу для вывода названия поры года по номеру месяца.
        int monthNum = 7;
        switch (monthNum){
            case 1, 2 ,12:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
        }

        //2. Написать программу для вывода названия поры года по номеру месяца.
        if (monthNum == 1 || monthNum == 2 || monthNum == 12) System.out.println("Зима");
        else if (monthNum == 3 || monthNum == 4 || monthNum == 5) System.out.println("Весна");
        else if (monthNum == 6 || monthNum == 7 || monthNum == 8) System.out.println("Лето");
        else System.out.println("Осень");

        //3. Напишите программу, которая будет принимать на вход число и на
        //выход будет выводить сообщение четное число или нет.
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) System.out.println("Четное число");
        else System.out.println("Нечетное число");

        //4. Для введенного числа t (температура на улице) вывести
        //Если t>–5, то вывести «Тепло».
        //Если –5>= t > –20, то вывести «Нормально».
        //Если –20>= t, то вывести «Холодно».
        int t = scanner.nextInt();
        if (t > -5) System.out.println("Тепло");
        else if (t <= -5 && t > -20) System.out.println("Нормально");
        else System.out.println("Холодно");

        //Циклы
        //1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
        for (int i = 1; i <= 99; i++){
            if (i % 2 != 0) System.out.println(i);
        }

        //2. Необходимо вывести на экран числа от 5 до 1.
        for (int i = 5; i >= 1; i--) System.out.println(i);

        //3. Напишите программу, где пользователь вводит любое целое
        //положительное число. А программа суммирует все числа от 1 до
        //введенного пользователем числа.

        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) sum += i;
        System.out.println(sum);

        //Напишите программу, которая выводит на консоль таблицу умножения.
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
