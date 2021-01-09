/*
Дан массив из целых чисел A(n), где n=1,25. Необходимо поменять местами его максимальный и минимальный элемент.
 */
package Lab6;
    
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Zad1 {
    public static void main(String[] args)
    {
        int i,n,lil=0,big=0;
        double u,min,max;
        double[] a = new double[25];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во элементов n: ");
        n = in.nextInt();
        for(i=0;i<n;i++){
           a[i]=Math.ceil(25*Math.random());
           System.out.format("%4.0f",a[i]);
        }
        min=a[0]; max=a[0];
        for(i=1;i<n;i++){
           if (min>a[i])
               min=a[i];
           if (max<a[i])
               max=a[i];
        }
        System.out.println("\nMin: "+min);
        System.out.println("Max: "+max);
        for(i=0;i<n;i++){
            if(a[i]==min)
                lil=i;
            if(a[i]==max)
                big=i;
        }
        u=a[lil]; 
        a[lil]=a[big]; 
        a[big]=u;
        System.out.println("\nМассив после перестановки:");
        for(i=0;i<n;i++)
           System.out.format("%4.0f",a[i]);
        System.out.println("\n");
    }
}
