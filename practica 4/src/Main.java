//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Scanner sca = new Scanner(System.in);

       //Inicio programa 1

        System.out.println("Programa 1. Contraseña");

        String contra = "Hola"+"usuario"+ ":)";


        System.out.println("Ingresa la contraseña: ");

        String contra1 =sca.next();

        if(contra.equalsIgnoreCase(contra1)){
            System.out.println("La contraseña es correcta");
        }

        else{
            System.out.println("La contraseña no es correcta");
        }


        System.out.println("Contraseña: "+contra);

        //Fin programa 1

    }//Llave fin public static
}//Llave fin Main