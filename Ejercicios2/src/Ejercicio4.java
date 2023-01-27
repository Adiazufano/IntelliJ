import java.util.Scanner;

public class Ejercicio4 {
    Scanner sc = new Scanner(System.in);
    public void Show()
    {
        byte t=0,b=0;
        do {
            System.out.println("Introduzca un valor :  ");
            byte a=Byte.valueOf(sc.nextLine());
            b+=a;
            t++;
        }
        while(t<10);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Ejercicio4 e4 = new Ejercicio4();
                e4.Show();
    }
}
