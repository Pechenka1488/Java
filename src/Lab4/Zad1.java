/*
Создайте приложение, которое покажет, что для выражения a^n+b^n=c^n (теорема Ферма) нет натуральных 
решений от 1 до 100 и n>2. Убедитесь, что есть решения для n=2, и выведите их в консоль.
 */
package Lab4;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class Zad1 {
        public static void main(String[] args)
    {
        int a,b,c,n,i=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        n = in.nextInt();
        for (a=1;a<101;a++)
           for (b=1;b<101;b++)
               for (c=1;c<101;c++)
                   if (Math.pow(c, n)==Math.pow(a, n)+Math.pow(b, n)){
                       i++;
                       System.out.format("%d^%d+%d^%d=%d^%d\n",a, n, b, n, c, n);}
        if (i==0) System.out.println("Нет возможных решений");
    }
}
