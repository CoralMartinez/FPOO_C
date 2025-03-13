//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {





        //Creamos un objeto rdn de clase Random
        Random rdn= new Random();
//Generamos numeros y los guardamos
        int numAleatorio = rdn.nextInt();

        System.out.println("Aleatorio entero " + numAleatorio);


        solicitud_datos usuario1 = new solicitud_datos("", "", "", 0, "");

        usuario1.solicitar_guardar_datos();
        usuario1.mostrar_datos();
        usuario1.crear_matricula();



        }//Llave static Main


    }//Llave Main





