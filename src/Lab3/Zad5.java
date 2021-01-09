/*
Составьте программу для нахождения длины катета прямоугольного треугольника (b), если известны длины гипотенузы (c) и катета (a). Результат вывести на консоль.
 */
package Lab3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Zad5 {
    public static void main(String[] args)
    {
        double a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите гипотенузу c: ");
        c = in.nextDouble();
        System.out.print("Введите катет a: ");
        a = in.nextDouble();
        b=Math.sqrt(c*c-a*a);
        System.out.println("Значение катета b: "+b);
    }
}
