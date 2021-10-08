package com.ru.code.code.LukyanovStas;

public class HW6 {

    /*Даны 2 числа. Вывести большее из них.

     */
    public static void main(String[] args) {
        task6();
    }

    private static void task6() {

        int num1 = 10;  //
        int num2 = 5;   //Плохие имена переменных, в таких случаях уже лучше писать firstNumber, secondNumber...
        int num3 = 0;   //

        if (num1 > num2) {
            System.out.println("больше: " + num1);
        } else if (num2 > num1) {
            System.out.println("больше: " + num2);
        } else if (num2 > num3) {
            System.out.println("больше: " + num3);
        }
    }
    /*
      Я немного теряюсь☺ В условии написано 2 числа, ты записываешь 3 числа, и условие для проверки 3 чисел неверное.
    Смотри. Если num1 > num2 -> твоя задача сразу выводит, что num1 больше, но даже не проверяет, num1 > num3.
    Т.е. если у нас числа 4, 2, 6 -> твоя программа выведет "больше: 4", переделай.
    P.s. При поиске большего числа, условий проверки должно быть (n - 1), где n - количество чисел
    */
}