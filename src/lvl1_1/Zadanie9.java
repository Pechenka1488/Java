/*
Число в квадрате
Напиши программу, которая выводит на экран квадрат числа 5.

Требования:
1. Программа должна выводить текст.
2. Метод main должен вызывать метод sqr с параметром 5.
3. Метод main должен выводить результат метода sqr.
4. Метод sqr изменять нельзя.
5. Выводимый текст должен соответствовать заданию.

 */
package lvl1_1;
/**
 *
 * @author user
 */
public class Zadanie9 {
    static int sqr(int a){
        int rez=a*a;
        return rez;
    }
    
    public static void main(String[] args){
        int a=sqr(5);
        System.out.println(a);
    }
}
