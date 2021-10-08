package com.ru.code.code.LukyanovStas;

public class HW3 {

    /* Дано целое число. Если оно является положительным, то прибавить к нему 1. Если отрицательным, то вычесть из
    него 2. Если нулевым, то заменить его на 10. Вывести полученное число.
     */
    public static void main(String[] args) { task3(); }

    private static void task3() {

        int num = 5; //Имя переменной плохое
        if(num > 0) {
            System.out.printf("Результат: %d", (num + 1));
        }
        else if (num < 0) {
            System.out.printf("Результат: %d", (num - 2));
        }
        else  {

        System.out.printf("Результат: 10 "); //Тут достаточно простого print, т.к. ты не шаблонизируешь строку, а просто что-то выводишь
    }

    }
}
