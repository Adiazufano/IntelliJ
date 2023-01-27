import java.util.Scanner;

public class Ejercicio9 {
    Scanner sc = new Scanner(System.in);
    public void Show()
    {
        String nota;
        System.out.println("Introduzca un valor: ");
        byte valor =Byte.valueOf(sc.nextLine());
        if(valor>=0&&valor<=4)
        {
            nota="Suspenso";
        }
        else if(valor>=5&&valor<=6)
        {
            nota="Suficiente";
        }
        else if(valor>=7&&valor<=8)
        {
            nota="Notable";
        }
        else
        {
            nota="Sobresaliente";
        }
        System.out.println(nota+"\t"+valor);
    }
    public static void main(String[] args) {
        Ejercicio9 e9 = new Ejercicio9();
        e9.Show();
    }
}
