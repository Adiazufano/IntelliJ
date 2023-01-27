import java.util.Scanner;

public class Ejercicio10 {
    Scanner sc = new Scanner(System.in);
    public void Show()
    {
        System.out.println("¿Sabes algo del tema di si o no ?");
        String respuesta=sc.nextLine();
       respuesta = respuesta.toLowerCase();
        if(respuesta.equals("si"))
        {
            System.out.println("Estas informado");
            System.out.println("Hablo");
        }
        else
        {
           System.out.println("No sé un carajo");
           System.out.println("¿te vas a informar si o no?");
           String respuesta1 = sc.nextLine();
            respuesta1 = respuesta1.toLowerCase();
           if (respuesta1.equals("si"))
            {
                System.out.println("¿Lo has entendido si o no ? ");
                String respuesta2 = sc.nextLine();
                respuesta2 = respuesta2.toLowerCase();
                if(respuesta2.equals("si"))
                {
                    System.out.println("He entendido");
                    System.out.println("Hablo");
                }
                else {
                    do
                    {
                        System.out.println("Informate otra vez ");
                        System.out.println("¿Lo has entendido si o no ? ");
                         respuesta2 = sc.nextLine();
                        respuesta2 = respuesta2.toLowerCase();
                    }while (respuesta2.equals("no"));
                    if(respuesta2.equals("si"))
                    {
                        System.out.println("Ya lo he entendido");
                        System.out.println("Hablo");
                    }
                }
            }
           else
           {
               System.out.println("Estoy callado");
           }
        }
    }
    public static void main(String[] args) {
 Ejercicio10 e10 = new Ejercicio10();
 e10.Show();
    }
}
