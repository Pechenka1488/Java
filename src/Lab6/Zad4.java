/*
Дан массив из целых чисел D(n), где n=1,30. Посчитайте сумму четных и нечетных элементов массива.
 */
package Lab6;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Zad4 {
    public static void main(String[] args)
    {
        int i,n;
        double chet=0,nechet=0,u=0;
        double[] a = new double[30];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во элементов n: ");
        n = in.nextInt();
        for(i=0;i<n;i++){
           a[i]=Math.ceil(25*Math.random());
           System.out.format("%4.0f",a[i]);
        }
        System.out.println("\n");
        for(i=0;i<n;i++)
            if(i%2==1)
               chet+=a[i];
            else nechet+=a[i];
        System.out.format("Сумма четных: %.0f",chet);
        System.out.println("\n");
        System.out.format("Сумма нечетных: %.0f",nechet);
        System.out.println("\n");
    } 
}
