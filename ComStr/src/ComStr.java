/**
 * Created by oleg on 13.04.14.
 */
public class ComStr {
public static void main(String[] args) {
    int a,b;
    a=6; b=0;
    try {
        a = a / b;
    }
    catch (ArithmeticException e){
        System.out.println("Деление на ноль.");
        a=0;
    }
    for(String s: args) System.out.print(s+" ");
    System.out.println();
    System.out.println("Всего аргументов: "+args.length);
    }
}
