package com.ru.code.code.LubinskiyDima;

public class HomeWork1 {
    public static void main(String[] args) {

        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
    }

    /**
     * 1) В переменную записываем число. Надо вывести на экран сколько в этом
     * числе цифр и положительное оно или отрицательное. Например, "это
     * однозначное положительное число". Достаточно будет определить, является ли
     * число однозначным, "двухзначным или трехзначным и более.
     */
    private static void task1() {
        int num = 615;
        int count = 0;
        String type = "ноль.";

        int temp = num;

        while (temp != 0) {
            temp /= 10;
            count++;
        }
        if (num > 0) {
            type = "положительное ";
            System.out.println(num + " это " + count + "-значное " + type + "число.");
        }
        else if (num < 0) {
            type = "отрицательное ";
            System.out.println(num + " это " + count + "-значное " + type + "число.");
        }
        else {
            System.out.println(num + " это " + type);
        }
    }

    /**
     * 2) Треугольник существует только тогда, когда сумма любых двух его сторон
     * больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
     * стороны предполагаемого треугольника. Требуется сравнить длину каждого
     * отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
     * окажется больше суммы двух других, то треугольника с такими сторонами не
     * существует.
     */
    private static void task2() {
        int a = 130,
            b = 5,
            c = 8;

        /*int a = 1,
            b = 5,
            c = 10;*/

        if (a + b > c && a + c > b && c + b > a)
            System.out.println("Треугольник существует");
        else
            System.out.println("Треугольник не существует");
    }

    /**
     * 3) Дано целое число. Если оно является положительным, то прибавить к нему 1.
     * Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
     * 10. Вывести полученное число.
     */
    private static void task3() {
        int num = 0;
                //-3;
                //-5;

        if (num > 0)
            System.out.println(num + " + 1 = " + (num + 1));
        else if (num < 0)
            System.out.println(num + " - 2 = " + (num - 2));
        else
            System.out.println(num + " -> " + 10);
    }

    /**
     * 4) Даны 3 целых числа. Найти количество положительных чисел в исходном
     * наборе.
     */
    private static void task4() {
        int a = 20,
            b = -2,
            c = 1;
        int count = 0;

        if(a > 0) count++;
        if(b > 0) count++;
        if(c > 0) count++;
        System.out.println("Положительных = " + count + " шт.");
    }

    /**
     * 5) Даны 3 целых числа. Найти количество положительных и отрицательных
     * чисел в исходном наборе.
     */
    private static void task5() {
        int a = -20,
            b = 2,
            c = -1;
        int poz = 0,
            neg = 0;

        if (a > 0) poz++;
        else neg++;
        if (b > 0) poz++;
        else neg++;
        if (c > 0) poz++;
        else neg++;

        System.out.println("Положительных = " + poz + " шт.\nОтрицательных = " + neg + " шт.");
    }

    /**
     * 6) Даны 2 числа. Вывести большее из них
     */
    private static void task6() {
        int a = -20,
            b = 21;
        if (a > b)
            System.out.println("Большее число a = " + a);
        else
            System.out.println("Большее число b = " + b);
    }

    /**
     * 7) (Дополнительно) В переменную записываете количество программистов. В
     * зависимости от количества программистов необходимо вывести правильно
     * окончание. Например:
     * • 2 программиста
     * • 1 программист
     * • 10 программистов
     */
    private static void task7() {

        String base0 = "ов";
        String base1 = "программист";
        String base24 = "а";

        for (int num = 0; num <= 2021; num++) {
            if (num % 10 == 1 && num % 100 != 11)
                System.out.println(num + " = " + base1);
            else if ((num % 10 == 2 || num % 10 == 3 || num % 10 == 4) && (num % 100 != 12 && num % 100 != 13 && num % 100 != 14))
                System.out.println(num + " = " + base1 + base24);
            else
                System.out.println(num + " = " + base1 + base0);
        }
    }

}
