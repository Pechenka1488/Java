/*
Напишите программу, выводящую на консоль таблицу 3х5 случайных элементов (a(i,j)< 10).
 */
package Lab6;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Zad5 {
    public static void main(String[] args)
    {
        int i,j,n,m;
        int[][] a = new int[3][5];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во элементов n: ");
        n = in.nextInt();
        System.out.print("Введите кол-во элементов m: ");
        m = in.nextInt();
        for(i=0;i<n;i++){
           for(j=0;j<m;j++){
               a[i][j]=(int)Math.ceil(25*Math.random());
               System.out.format("%4d",a[i][j]);
           }
           System.out.println();
        }
    }     
}
