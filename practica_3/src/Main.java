
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

         //Inicio Programa 1

        System.out.println("Programa que calcula la paga del usuario");

        Scanner sca =  new Scanner(System.in);

        System.out.println("Introduce el numero de horas trabajadas");
        int horas_trabajadas = sca.nextInt();

        System.out.println("Introduce el costo por hora");

        double costo_hora= sca.nextDouble();

        double paga = horas_trabajadas * costo_hora;

        System.out.println("Su paga es de: "+paga);

        //Fin Programa 1

        //Inicio Programa 2

        System.out.println("Programa nombre usuario");

        System.out.println("Ingresa tu nombre");
        String nombre = sca.next();

        System.out.println("Introduce tu apellido paterno");
        String ap_p = sca.next();

        System.out.println("Introduce tu apellido materno");
        String ap_m = sca.next();

        for(int i=0;i<3;i++){

            System.out.println("Nombre completo: "+nombre+" "+ap_p+" "+ap_m);
        }

        //Fin Programa 2

        //Inicio programa 3

        System.out.println("Programa suma de numeros");

        System.out.println("Introduce un numero entero");
        int numero_1 = sca.nextInt();
        int sumanum=0;

        for(int e=1;e<=numero_1;e++){

            sumanum = sumanum + numero_1;

            System.out.println("El total de la suma es: "+sumanum);
        }





    }//Llave static
}//Llave  main