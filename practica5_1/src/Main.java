//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sca = new Scanner(System.in);

        System.out.println("Programa 1. Número entero y números impares");
        System.out.println("Ingresa un número entero positivo");
        int numero = sca.nextInt();


        for (int i = 1; i <= numero; i++) {

             if (i % 2 == 0){
                System.out.printf(i+", ");

             }
        }
    }
}