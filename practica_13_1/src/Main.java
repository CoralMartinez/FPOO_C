import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        vehiculo vehiculo1 = null;


        while (true) {
            String opcion_menu = JOptionPane.showInputDialog("Elija una opción del menú: \n" +
                    "1. Registrar vehículo \n" +
                    "2. Registrar conductor \n" +
                    "3. Asignar un conductor al vehículo \n" +
                    "4. Registrar envío \n"+
                    "5. Registrar entrega \n"+
                    "6. Actualizar estado de entrega \n"+
                    "7. Mostrar información \n"+
                    "8. Salir");

            if (opcion_menu == null || opcion_menu.equals("9")) {
                break;
            }

            switch(opcion_menu){

                case "1":

                    vehiculo1 = new vehiculo();

                    break;

                case "2":

                    break;

                case "3":

                    break;

                case "4":

                    break;

                case "5":

                    break;

                case "6":

                    break;

                case "7":

                    break;

                case "8":
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");

            }


        }
    }
}// Fin llave clase principal