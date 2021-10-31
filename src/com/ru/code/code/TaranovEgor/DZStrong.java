package com.ru.code.code.TaranovEgor;

import java.util.Scanner;

public class DZStrong {
    //Найти первый повторяющийся символ в строке
    public static void main(String[] args) {
        System.out.println("Введите фразу");
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();

        for(int i=0;i<string.length();i++){
            for (int j=i+1;j<string.length();j++){
                if (string.charAt(i)==string.charAt(j)){
                    if (string.charAt(i)==' '){
                        System.out.println("первый повторяющийся символ -пробел "+"\"\"");

                    }else System.out.println("первый повторяющийся символ "+string.charAt(i));

                    return;
                }
            }
        }
    }

}
