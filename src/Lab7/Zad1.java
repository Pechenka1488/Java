/*
Создайте приложение, в котором имеются три класса: fclass1, fclass2, fclass3. 
В классе fclass1 содержится метод main(). Класс fclass3 наследуется от fclass1, а fclass2 — от fclass3.
 */
package Lab7;

/**
 *
 * @author user
 */
public class Zad1 {
    public int f1=111;
    protected int f2=222;
    int f3=333;
    private int f4=444;
    public int getF4(){
        return this.f4;
    }
    public void method1(){
        System.out.format("Переменные класса Zad1: %d, %d, %d, %d \n",this.f1,this.f2,this.f3,getF4());
    }
    
    public static void main(String[] args)
    {
        new Zad1().method1();
        new class3().method1();
        new class2().method1();
    }
}

class class2 extends class3{
    private int c=777;
    protected int d=666;
    public void method1(){
        System.out.format("Переменные класса class2: %d, %d \n",this.c,this.d);
        System.out.format("Наследуемые переменные из класса class3 классом class2: %d, %d \n",this.a,this.b);
        System.out.format("Наследуемые переменные из класса Zad1 классом class2: %d, %d, %d, %d \n",this.f1,this.f2,this.f3,getF4());
    }
}

class class3 extends Zad1 {
    int a=0;
    public int b=1;
    public void method1(){
        System.out.format("Переменные класса class3: %d, %d \n",this.a,this.b);
        System.out.format("Наследуемые переменные из класса Zad1 классом class3: %d, %d, %d, %d \n",this.f1,this.f2,this.f3,getF4());
        }
}