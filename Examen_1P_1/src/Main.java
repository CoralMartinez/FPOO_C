
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


/* for (int i = 1; i <= 5; i++) {
                       System.out.println("i = " + i);
                   }



                    for (int i = numero; i <= 400; i++) {
            System.out.println("i = " + i);
        }

                   */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Programa numeros pares entre el 200 y el 400");

        Scanner sca = new Scanner(System.in);

        System.out.println("Ingresa un numero entre el 200 y el 400");

        int numero = sca.nextInt();


        //%  2 == 0

       /* if (numero % 2 == 0) {

            System.out.println("es par");
        }

        else {
            System.out.println("no es par");

        }

        */

       /* for (int i = numero; i <= 400;i++) {

            if (numero % 2 == 0) {
                System.out.println("ES PAR" + i);
            }

            else {
                System.out.println("    NO ES PAR"+i);
            }
        }

        System.out.println("----:)--");


        */


        if (numero >= 200 && numero <= 400) {

            if (numero % 2 == 0) {

                for (int i = numero; i <= 400; i++) {

                    if (i % 2 == 0) {

                        System.out.println(i);
                    }
                }
            }
                else{
                    System.out.println("Es un numero impar ingresa un número par, número: " + numero);
                }

            }

         else{
            System.out.println("Ingresa un número entre 200 y 400, número: " + numero);
        }


  }
}