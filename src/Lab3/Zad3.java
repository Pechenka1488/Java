/*
 Даны два действительных числа. Необходимо полу-чить их сумму, разность и произведение. Результат вывести на консоль.
 */
package Lab3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Zad3 {
    public static void main(String[] args)
    {
        double a,b,sum,raz,pr;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a: ");
        a = in.nextDouble();
        System.out.print("Введите число b: ");
        b = in.nextDouble();
        sum=a+b;
        raz=a-b;
        pr=a*b;
        System.out.println(a+"+"+b+"="+sum+"\n"+a+"-"+b+"="+raz+"\n"+a+"*"+b+"="+pr);
    }
}
