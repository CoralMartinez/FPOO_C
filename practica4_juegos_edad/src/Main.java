//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Programa 3. Sala de juegos y edad");

        Scanner sca =  new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");

        int edad = sca.nextInt();

        if(edad<4){
            System.out.println("Tu entrada es gratis");

        }

        if (edad>=4 && edad <18){

            System.out.println("Tu entrada es de $110 pesos ");
        }

        if (edad>18){

            System.out.println("Tu entrada es de $190 pesos ");
        }



    }
}