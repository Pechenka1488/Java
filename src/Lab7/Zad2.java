/*
Создайте приложение, в котором имеются два класса: fclass1, fclass2. В классе fclass1 содержится метод main(). 
Создайте методы в fclass2 для доступа к закрытым переменным класса fclass1.
 */
package Lab7;

/**
 *
 * @author user
 */
public class Zad2 {
    private int a=2,b=5,c=9;
    public int a(){
        return this.a;
    }
    public int b(){
        return this.b;
    }
    public int c(){
        return this.c;
    }
    public void method1(){
        System.out.format("Переменные класса Zad2: a=%d, b=%d, c=%d \n",this.a,this.b,this.c);
    }
    
    public static void main(String[] args)
    {
        new Zad2().method1();
        new rab().method1();
    }
}

class rab extends Zad2 {
    int summ,mult;
    public void method1(){
        summ=a()+b()+c();
        mult=a()*b()*c();
        System.out.format("Сумма переменных из класса Zad2: %d \n",this.summ);
        System.out.format("Произведение переменных из класса Zad2: %d \n",this.mult);
    }
}