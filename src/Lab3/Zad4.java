/*
 Определить время свободного падения материального тела с заданной высоты h. Результат вывести в консоль.
 */
package Lab3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Zad4 {
      public static void main(String[] args)
    {
        double t,h;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a: ");
        h = in.nextDouble();
        t= Math.sqrt(2*h/9.8);
        System.out.println("Время падения: "+t);
    }
}
