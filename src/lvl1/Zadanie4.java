/*
 Выводим квадрат числа
Напиши программу, которая считывает с клавиатуры целое число a и выводит квадрат 
этого числа (a * a)
Для считывания данных с клавиатуры используй метод nextInt() класса Scanner.

Требования:
1. Программа должна выводить текст.
2. В программе необходимо создать объект типа Scanner.
3. Программа должна считывать данные с клавиатуры.
4. Программа должна выводить квадрат считанного числа.

 */
package lvl1;

/**
 *
 * @author user
 */

import java.util.Scanner;

public class Zadanie4 {
     public static void main(String[] args)
    {   
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.print("Введите число ");
        a=in.nextInt();
        b=a*a;
        System.out.println("Квадрат числа "+ a + " равен "+ b);
    }
}
