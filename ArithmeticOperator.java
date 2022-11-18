public class ArithmeticOperator
{
  public static void main(String args[])
    {
       int a = 10;
       int b = 20;
       int c = 25;
       int d = 25;
System.out.println("a+b = " + (a+b));
System.out.println("a-b = " + (a-b));
System.out.println("a*b = " + (a*b));
System.out.println("b/a = " + (b/a));
System.out.println("b%a = " + (b%a));
System.out.println("c%a = " + (c%a));

System.out.println("a++ = " + (a++));//a old value=10;new value=11
System.out.println("a-- = " + (a--));//a old value=11;new value=10

System.out.println("d++ = " + (d++));//old value d=25;new value d=26
System.out.println("++d = " + (++d));//new value d = 26+1 = 27
     }
}