package com.ru.code.code.TaranovEgor;

import java.util.Scanner;

public class DZ2 {
    //определить существует ли треугольник
    public static void main(String[] args) {
        System.out.println("Введите длины сторон треугольника в целых числах:");
//        Scanner scanner=new Scanner(System.in); нарушаешь нормы чистого кода, на уроке расскажу, проблема 100% новичков
        Scanner scanner = new Scanner(System.in); //так правильно - операторы должны отделяться пробелами

        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
//        int sum1=a+b;
//        int sum2=a+c;
//        int sum3=b+c;
//        if (a>=sum3||b>=sum2||c>=sum1){ сделано верно, но можно сократить и избежать создания лишних переменных
        if (a >= a + b || b >= a + c || c >= b + c){ //такой вариант лучше
            System.out.println("Такого треугольника не существует. Разве что в геометрии Лобачевского.");
        }else System.out.println("Такой треугольник может существовать");
    }
}
