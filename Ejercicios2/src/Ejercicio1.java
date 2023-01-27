import java.util.Scanner;

public class Ejercicio1 {
    byte a,b;
 public Ejercicio1() {
     Scanner sc = new Scanner(System.in);
     System.out.print("Introduzca el valor de a:");
      a = sc.nextByte();
     System.out.println("Introduzca el valor de b:");
      b = sc.nextByte();


 }
 public void Show()
 {
     System.out.println(a + b);
 }

    public static void main(String[] argss) {
     Ejercicio1 e1 = new Ejercicio1();
     e1.Show();
    }
}

