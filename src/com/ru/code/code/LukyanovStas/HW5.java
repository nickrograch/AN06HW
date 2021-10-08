package com.ru.code.code.LukyanovStas;

public class HW5 {

    /*Даны 3 целых числа. Найти количество положительных и отрицательных
чисел в исходном наборе.
    */
    public static void main(String[] args) {
        task5();
    }

    private static void task5() {
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int countNegative = 0;
        int countPositive = 0;
        if (number1 < 0) {
            ++countNegative; //в случае, когда все, что мы делаем - прибавляем единицу, то принято использовать постфиксный (countNegative++)
        } else if (number1 > 0) {
            ++countPositive;//то же самое, строка 19
        }

        if (number2 < 0) {
            ++countNegative;//то же самое, строка 19
        } else if (number2 > 0) {
            ++countPositive;//то же самое, строка 19
        }

        if (number3 < 0) {
            ++countNegative;//то же самое, строка 19
        } else if (number3 > 0) {
            ++countPositive;//то же самое, строка 19
        }

        System.out.printf("Negative numbers count %d", countNegative);
        System.out.println();
        //Можно записать 1 строкой --> Вспомни, как в одной из задач ты указал перенос строки прямо в выводимом тексте
        System.out.printf("Positive numbers count %d", countPositive);
    }
    //А вот почему HW4 и HW5 имеют одинаковое условие (по сути одна задача)? ¯\_(ツ)_/¯
}
