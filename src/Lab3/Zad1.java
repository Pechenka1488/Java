/*
 С помощью цикла вычислите значение выражения 2^n
 */
package Lab3;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Zad1 {
    public static void main(String[] args)
    {
        int i,x;
        double g;
        g=1;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите степень: ");
        x = in.nextInt();
        if (x<0)
        {  x=Math.abs(x);
           for (i=0;i<x;i++)
              g=g/2;      }
        else 
           for (i=0;i<x;i++)
              g=g*2;
        System.out.println("2^"+x+"="+g);
    }
}
