/*
Даны 5 строк s1, s2, s3, s4 и s5, на основе условия: если строка s4 равна строке s5, нужно сложить строки s1 и s2, иначе нужно сложить строки s1 и s3.
 */
package Lab6;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Zad7 {
    public static void main(String[] args)
    {
        String s,s1,s2,s3,s4,s5;
        Scanner in = new Scanner(System.in);
        System.out.print("1я строка: ");
        s1 = in.nextLine();
        System.out.print("2я строка: ");
        s2 = in.nextLine();
        System.out.print("3я строка: ");
        s3 = in.nextLine();
        System.out.print("4я строка: ");
        s4 = in.nextLine();
        System.out.print("5я строка: ");
        s5 = in.nextLine();
        if(s4==s5)
            s=s1+s2;
        else s=s1+s3;
        System.out.println(s);    
    }
}
