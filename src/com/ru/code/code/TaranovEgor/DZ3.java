package com.ru.code.code.TaranovEgor;

public class DZ3 {
    //если число положитительное, то прибавить 1, отрицательное- отнять 2, ноль-прировнять к 10
    public static void main(String[] args) {
        int a=0; //Я так полагаю ты тут наверняка хотел сделать - Scanner scanner = new Scanner(System.in);
                // int a = scanner.nextInt();
        if (a>0){
           a++;
            System.out.println("a= "+a);
        }else  if (a<0){
            a=a-2;
            System.out.println("a= "+a);
        }else {
           // a=10;
            System.out.println("a= "+(a=10));
        }

    }
}
