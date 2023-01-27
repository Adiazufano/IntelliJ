import java.util.Scanner;

public class Ejercicio7 {
    Scanner sc = new Scanner(System.in);
    public void Show()
    {
        char b=0;
        for (byte a=0;a<255;a++)
        {
            b++;
            System.out.println(b);

        }
    }

    public static void main(String[] args) {
        Ejercicio7 e7 = new Ejercicio7();
        e7.Show();
    }
}
