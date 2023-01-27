import java.util.Scanner;

public class Ejercicio3 {
    byte a,b;
    Scanner sc = new Scanner(System.in);
    Ejercicio3()
    {

        System.out.println("Introduzca el valor que deseas que tenga el primer numero :  ");
        a=Byte.valueOf(sc.nextLine());
        System.out.println("Introduzca el valor que deseas que tenga el segundo numero :  ");
        b=Byte.valueOf(sc.nextLine());


    }
   public void Show()
   {   do{
       if (a!=b)
       {
               System.out.println("Introduzca el valor que deseas que tenga el primer numero :  ");
               a=Byte.valueOf(sc.nextLine());
               System.out.println("Introduzca el valor que deseas que tenga el segundo numero :  ");
               b=Byte.valueOf(sc.nextLine());
       }
   }
   while(a!=b);
     System.out.println("Son iguales");
   }
    public static void main(String[] args) {
        Ejercicio3 e3 = new Ejercicio3();
        e3.Show();
    }
}
