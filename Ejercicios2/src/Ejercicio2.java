import java.util.Scanner;

public class Ejercicio2 {
    Scanner sc = new Scanner(System.in);
    byte a,b;
    Ejercicio2()
    {
        System.out.println("Introduzca un numero: ");
        a=Byte.valueOf(sc.nextLine());
        System.out.println("Introduzca otro numero: ");
        b=Byte.valueOf(sc.nextLine());

    }
    public void Show()
    {
        if(a>b)
        {
            System.out.print("Mayor: "+a);
        }
        else if(b>a)
        {
            System.out.print("Mayor: "+b);
        }
        else
        {
            System.out.print("Los 2 numeros son iguales");
        }
    }
    public static void main(String[] args) {
        Ejercicio2 e2 = new Ejercicio2();
        e2.Show();
    }
}
