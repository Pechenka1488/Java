/*
 Составьте программу расчета факториала для произвольного числа n<10.
 */
package Lab3;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Zad2 {
    public static void main(String[] args)
    {
        int i,x,g;
        g=1;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число меньше 10: ");
        x = in.nextInt();
        for (i=1;i<x+1;i++)
           g=g*i;
        System.out.println(x+"!="+g);
    }
}
