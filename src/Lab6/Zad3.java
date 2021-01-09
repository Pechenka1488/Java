/*
Дан массив из целых чисел С(n), где n=1,20. Необходимо найти среднее значение и вывести его на консоль.
*/
package Lab6;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Zad3 {
    public static void main(String[] args)
    {
        int i,n;
        double sr,u=0;
        double[] a = new double[25];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во элементов n: ");
        n = in.nextInt();
        for(i=0;i<n;i++){
           a[i]=Math.ceil(25*Math.random());
           System.out.format("%4.0f",a[i]);
        }
        System.out.println("\n");
        for(i=0;i<n;i++)
            u+=a[i];
        sr=u/n;
        System.out.format("Среднее значение: %.2f",sr);
        System.out.println("\n");
    } 
}
