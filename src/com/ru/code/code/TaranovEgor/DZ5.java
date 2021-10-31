package com.ru.code.code.TaranovEgor;

import java.lang.invoke.SwitchPoint;

public class DZ5 {
    // это дз 4 и дз 5 вместе найти количество отрицательных и положительных чисел в исходном наборе из трех чисел
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=15;
        int counterPos=0;
        int counterNeg=0;
        int counterNeutral=0;
        if(a>0){
            counterPos++;
        }else if (a==0){counterNeutral++;}
        if(b>0){
            counterPos++;
        }else if (b==0){counterNeutral++;}
        if (c>0){
            counterPos++;
        }else if (c==0){counterNeutral++;}
        counterNeg=3-counterPos-counterNeutral;
        System.out.println("положительных "+counterPos+"\nотрицательных "+counterNeg+"\nнейтральных "+counterNeutral);
    }
        //Хороший и простой способ
}
