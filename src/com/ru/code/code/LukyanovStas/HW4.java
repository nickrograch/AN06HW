package com.ru.code.code.LukyanovStas;

public class HW4 {

    /* Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
     */
    public static void main(String[] args) {
        int[] num = {10, 5, -1};
        int A = 2;                                          //Плохие имена переменных, для твоего понимания, лучше их назвать так:
        int B = 5;                                          //int[] numbers\numberArray
//блок объявления переменных не стоит разбивать строкой     //int firstNumber
        int Negative = 0;                                   //int secondNumber
        int Positive = 0;                                   //int negativeCount
                                                            //int positiveCount
        for(int i = 0; i < num.length; i++) {
            if(num[i] < 0) {
                Negative++;
            } else if(num[i] > 0) {
                Positive++;
            }
        }
        System.out.printf("Положительных: %d%nОтрицательных: %d%n%n", Positive, Negative);
        //Лучше для переноса строки использовать \n, он выделяется idea оранжевым цветом и более заметен. И зачем 2 переноса строки в конце?
        //В последнем выводе вообще перенос строки не нужно указывать, т.к. он записывается неявно
    }
}
