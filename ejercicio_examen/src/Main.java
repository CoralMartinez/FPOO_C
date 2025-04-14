


import javax.swing.JOptionPane;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


                // Solicitar datos al usuario
                String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
                String apellidoP = JOptionPane.showInputDialog("Introduce tu apellido paterno:");
                String apellidoM = JOptionPane.showInputDialog("Introduce tu apellido materno:");
                String anoNacimiento = JOptionPane.showInputDialog("Introduce tu año de nacimiento:");
                String carrera = JOptionPane.showInputDialog("Introduce tu carrera:");

                // Extraer los elementos de la contraseña
                String parteNombre = nombre.substring(0, 1); // Primera inicial del nombre
                String parteApellidoP = apellidoP.substring(0, 2); // Dos primeras letras del apellido paterno
                String parteApellidoM = apellidoM.substring(0, 2); // Dos primeras letras del apellido materno
                String parteAnio = anoNacimiento.substring(anoNacimiento.length() - 2); // Últimos dos dígitos del año de nacimiento
                String parteCarrera = carrera.substring(0, 3); // Tres primeras letras de la carrera

                // Generar números aleatorios
                Random rand = new Random();
                int numAleatorio2 = rand.nextInt(90) + 10; // Número de 2 dígitos (10-99)
                int numAleatorio3 = rand.nextInt(900) + 100; // Número de 3 dígitos (100-999)
                int numAleatorio4 = rand.nextInt(9000) + 1000; // Número de 4 dígitos (1000-9999)

                // Generar las contraseñas
                String contrasena2 = parteNombre + parteApellidoP + parteApellidoM + parteAnio + parteCarrera + numAleatorio2;
                String contrasena3 = parteNombre + parteApellidoP + parteApellidoM + parteAnio + parteCarrera + numAleatorio3;
                String contrasena4 = parteNombre + parteApellidoP + parteApellidoM + parteAnio + parteCarrera + numAleatorio4;

                // Mostrar contraseñas al usuario
                JOptionPane.showMessageDialog(null, "Contraseña con 2 dígitos aleatorios: " + contrasena2 +
                        "\nContraseña con 3 dígitos aleatorios: " + contrasena3 +
                        "\nContraseña con 4 dígitos aleatorios: " + contrasena4);
            }
        }






