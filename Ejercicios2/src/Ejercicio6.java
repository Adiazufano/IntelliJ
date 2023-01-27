import java.util.Scanner;


public class Ejercicio6 {
    Scanner sc = new Scanner(System.in);
    public void Show()
    {
        System.out.println("Introduzca un numero del 1 al 7: ");
        byte a =Byte.valueOf(sc.nextLine());
        String dia;
        if(a==1)
        {
         dia="Lunes";
        }
        else if(a==2)
        {
            dia="Martes";
        }
        else if (a==3)
        {
            dia="Miercoles";
        }
        else if (a==4)
        {
            dia="Jueves";
        }
        else if (a==5)
        {
            dia="Viernes";
        }
        else if (a==6)
        {
            dia="Sabado";
        }
        else
        {
            dia="Domingo";
        }
        System.out.println(dia);
    }
    public static void main(String[] args) {
        Ejercicio6 e6 = new Ejercicio6();
        e6.Show();
    }
}
