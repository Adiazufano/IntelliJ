import java.util.Scanner;

public class Ejercicio5 {
    Scanner sc = new Scanner(System.in);

    public void Show()
    {
        byte b=0;
        for (byte t=0;t<10;t++)
        {
            System.out.println("Introduzca un valor :  ");
            byte a=Byte.valueOf(sc.nextLine());
            b+=a;
        }
        System.out.println(b);
    }
    public static void main(String[] args) {
        Ejercicio5 e5 = new Ejercicio5();
        e5.Show();
    }
}
