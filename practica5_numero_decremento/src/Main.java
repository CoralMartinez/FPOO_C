//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sca = new Scanner(System.in);

        System.out.println("Programa 2. Número entero decremento");
        System.out.println("Ingresa un número entero positivo");
        int num = sca.nextInt();

        for (int i = num; i >= 0; i--) {

        System.out.printf(i+", ");
        }
    }
}