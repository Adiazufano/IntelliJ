import java.util.Scanner;

public class Ejercicio8 {
    Scanner sc = new Scanner(System.in);
    public void Show()
    {
        String nota;
        System.out.println("Introduzca el valor: ");
        byte valor =Byte.valueOf(sc.nextLine());
        switch (valor)
        {
            case 0:nota="Suspenso";break;
            case 1:nota="Suspenso";break;
            case 2:nota="Suspenso";break;
            case 3:nota="Suspenso";break;
            case 4:nota="Suspenso";break;
            case 5:nota="Suficiente";break;
            case 6:nota="Suficiente";break;
            case 7:nota="Notable";break;
            case 8:nota="Notable";break;
            default:nota="Sobresaliente";
        }
        System.out.println(nota+"\t"+valor);
    }
    public static void main(String[] args) {
   Ejercicio8 e8 = new Ejercicio8();
   e8.Show();
    }
}
