/*
Дан массив из целых чисел B(n), где n=1,25. Необходимо упорядочить массив по возрастанию.
 */
package Lab6;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Zad2 {
   public static void main(String[] args)
    {
        int i,n,j;
        double u=0;
        double[] a = new double[25];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во элементов n: ");
        n = in.nextInt();
        for(i=0;i<n;i++){
           a[i]=Math.ceil(25*Math.random());
           System.out.format("%4.0f",a[i]);
        }
        for(i=0;i<n;i++)
            for(j=0;j<n;j++){
            if (a[i]<a[j]){
                u=a[i]; 
                a[i]=a[j]; 
                a[j]=u;    }
        }        
        System.out.println("\nМассив после перестановки:");
        for(i=0;i<n;i++)
           System.out.format("%4.0f",a[i]);
        System.out.println("\n");
    } 
}
