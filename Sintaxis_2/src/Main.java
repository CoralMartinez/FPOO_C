//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//Clase principal

import java.util.Random;
import java.util.Scanner;

public class Main {

    /*comentario

    comentario

    comentario*/


    //Metodo main
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        /*Comentario
        de varias
        líneas
         */

        System.out.println("Hello World!");
        System.out.println("Hola, Coral Martínez Silvestre");


        String cadenas = "Coral " + "Martinez " + "Silvestre";

        System.out.println(cadenas);

        System.out.println(cadenas.length());

        //Sustraer caracteres

        System.out.println(cadenas.substring(2,5));

        System.out.println(cadenas.substring(2));//solo se coloca el 2 y el beginindex aparece de forma automatica


        System.out.println(cadenas.substring(0,5));


        //3. Variables

        int x= 5, x2;
        double y= 1.25, y2;
        String z = "204", z1;

        //Conversion de cadena a int
        x2 = Integer.parseInt(z);

        //Conversion de double a cadena
        z1 = String.valueOf(y);

        //Conversion de int a double

        double asd = Double.valueOf(x);

        //Conversion implícita

        int num = 12;
        double numD = num;

        //De entero a double

        System.out.println("Conversion implicita " + numD);

//Cremos un objeto rdn de clase Random
        Random rdn= new Random();
//Generamos numeros y los guardamos
        int numAleatorio = rdn.nextInt();
        double numDouble = rdn.nextDouble();

        System.out.println(x2);

        System.out.println(z1);

        System.out.println(asd);

        System.out.println("Aleatorio entero " + numAleatorio);
System.out.println("Aleatorio double " +numDouble);

//4. Solicitud de datos

Scanner scn =  new Scanner(System.in);

System.out.println("Introduce cualquier dato ");

String dato = scn.nextLine();

 System.out.println("Introduce un dato entero ");

int datoentero = scn.nextInt();

System.out.println("Introduce dato con decimales ");

double datodecimal = scn.nextDouble();

System.out.println("Cualquier dato" +dato);

System.out.println("Dato entero" +datoentero);

 System.out.println("Dato decimal" +datodecimal);

//5.Boolean, operadores lógicos y de comparación

System.out.println(10>9); //true

 System.out.println(10==9); //false

 System.out.println(10<9); //false

 System.out.println(10>=9); //true

  System.out.println(10<=9); //false

 System.out.println(10!=9); //true

int x=3;

System.out.println(x<5 && x>10);

System.out.println(x<5 || x>10);

System.out.println(!(x<5 && x>10));





 }
}