

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        /*Se requiere un programa que procese una lista que guarde N números a petición del usuario una vez
        completada la lista el programa debe imprimir 2 resultados la sumatoria de los números pares y la sumatoria
        de los números impares:

         */

       /* Scanner sca =  new Scanner(System.in);

        System.out.println("Programa que suma números pares e impares");
        System.out.println("¿Cuántos números deseas ingresar?");
        int numeros = sca.nextInt();


        System.out.println("Ingresa los numeros:");

         for (int i = 0; i <= numeros; i++) {

             int numeros_2 = sca.nextInt();


         if(numeros_2 % 2 == 0){
             int sumpar=0;
             sumpar=numeros_2+i;


             System.out.println("La suma de los números pares es: "+sumpar);
             }

             else{
             int sumimpar=0;

                 sumimpar=numeros_2+i;
                //System.out.println("La suma de los números impares es: "+sumimpar);
             }


      }//Fin llave for

        */




        solicitud uno = new solicitud(3, "I");

        uno.solicitar_numeros_arabigos();
        uno.solicitar_numeros_romanos();



    }//Fin llave  public static
}//Fin Llave Main