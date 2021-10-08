package com.ru.code.code.TaranovEgor;

import java.util.Scanner;
// Задание: в зависимости от количества программистов, вывести его с правильным окончанием в слове программист
public class DZ7 {
    public static void main(String[] args) {
        int num=0;

        System.out.println("введите сколько половых партнеров-программистов у вас было ");
        Scanner scanner=new Scanner(System.in);
        boolean bool=true;
        while (bool){
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
            bool=false;
        } else {
            System.out.println("Вы ввели какую-то,мягко скажем, отсебятину, а не целое число, " +
                    "\n попытайтесь еще раз");
                     scanner.next();
               }
        }

        String strNum = String.valueOf(num);

        int lastDigit=Integer.valueOf(strNum.substring(strNum.length()-1)); //крайняя цифра в числе(окончание)
         if ( num>10&&num<15){
            System.out.println("у вас было "+num+" програvмистов");
        }else if(lastDigit==1){
            System.out.println("у вас был "+num+ " программист");
        }else if(lastDigit >1 && lastDigit<5){
            System.out.println("у вас было "+num+" программиста");
        }else if (lastDigit==0||
                (lastDigit>4&& lastDigit<10)){
            System.out.println("у вас было "+num+" программистов");
        }
    }

}

