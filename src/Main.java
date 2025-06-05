//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // пример 1
        for (int i = 0; i < 10; i++)
            System.out.println("Итерация цикла " + i);
        for (int i = 2020; i < 2070; i = i + 4) {
            System.out.println("Високосный год " + i);
        }
        //пример 2

        int salary = 65535;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println(" месяц " + i + " итого " + total);
        }
        System.out.println(total);
        //задача 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //задача 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //задача 3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        //задача 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //задача 5

        for (int i = 1904; i <= 2096; i++){
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
            System.out.println("Високосный год " + i);
        }
        //задача 6

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        //задача 7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        //задача 8
        int cent = 29000;
        int yar = 0;
        for (int i = 0; i <= 12; i++) {
            yar = yar + cent;
            System.out.println("за месяц " + i + " равна " + yar);
        }

        //задача 9
        int cent1 = 29000;
        int total1 = 0;
        for (int i = 0; i <= 12; i++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + cent1;
            System.out.println("За месяц " + i + " сумма накоплений ровна " + total1);
        }
        System.out.println("и того " + total1);


        //задача 10
            for (int i = 1, result =  2; i <= 10; i++, result = i * 2) {

            System.out.printf("2 * %s = %s%n", i , result);
        }

    }
}

