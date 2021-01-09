/*
Измените программу 1 так, чтобы она выводила на консоль еще и максимальный элемент (с помощью описания нового метода, например maxX()).
 */
package Lab6;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Zad6 {
    public static int maxix() {
        int i,n;
        int max;
        int[] a = new int[25];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во элементов n: ");
        n = in.nextInt();
        for(i=0;i<n;i++){
           a[i]=(int)Math.ceil(25*Math.random());
           System.out.format("%4d",a[i]);
        }
        max=a[0];
        for(i=1;i<n;i++)
           if (max<a[i])
               max=a[i];
        return max;
    }
    
    public static void main(String[] args)
    {
        System.out.println("\nМаксимальный элемент: "+maxix());
    } 
}
