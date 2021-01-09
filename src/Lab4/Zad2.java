/*
 Вычислить выражение 1-1/2+1/3-1/4+....+1/9999-1/10000 используя оператор условия.
 */
package Lab4;
/**
 *
 * @author user
 */
public class Zad2 {
            public static void main(String[] args)
    {
        
        float a=0,i;
        for (i=1;i<10001;i++)
           if(i%2==0) a=a-1/i;
           else a=a+1/i;
        System.out.println("Значение выражения: "+a);
    }
}
