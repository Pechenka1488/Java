/*
Для произвольной цифры от 0 до 9 вывести на консоль ее значение прописью. Например, для цифры 9 на консоли должна быть напечатана строка «Девять».
 */
package Lab5;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Zad1 {
    public static void main(String[] args)
    {
        double a;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        a = in.nextDouble();
        if ((a%1 != 0) || (a>9) || (a<0))
        {
            System.out.println("Некорректное число");
        }
        else
        {
        int n = (int)a;
        switch(n){
            case 0:
               System.out.println("0 это ноль");
               break;
            case 1:
               System.out.println("1 это один");
               break;
            case 2:
               System.out.println("2 это два");
               break;
            case 3:
               System.out.println("3 это три");
               break;
            case 4:
               System.out.println("4 это четыре");
               break;
            case 5:
               System.out.println("5 это пять");
               break;
            case 6:
               System.out.println("6 это шесть");
               break;
            case 7:
               System.out.println("7 это семь");
               break;
            case 8:
               System.out.println("8 это восемь");
               break;
            case 9:
               System.out.println("9 это девять");
               break;   
        }
        }
    } 
}