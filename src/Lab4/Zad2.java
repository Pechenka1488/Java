/*
 Вычислить выражение 1-1/2+1/3-1/4+....+1/9999-1/10000 используя оператор условия.
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Zad2 {
            public static void main(String[] args)
    {
        int n;
        float a=0,i;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        n = in.nextInt();
        for (i=1;i<n+1;i++)
           if(i%2==0) a=a-1/i;
           else a=a+1/i;
        System.out.println("Значение выражения: "+a);
    }
}
