import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //Se crea el primer objeto

        caja_popular usuario1 = new caja_popular();

        caja_popular usuario2 = new caja_popular();


        //Se asignan atributos al objeto


        usuario1.id_administracioncuenta = 12;
        usuario1.nombre_titular = "Leticia Cruz Gutiérrez";
        usuario1.numero_cuenta = 1245345328;
        usuario1.edad_titular = 35;
        usuario1.saldo_titular = 1500.00;

        //Se asignan atributos al objeto (usuario a depositar)

        usuario2.id_administracioncuenta = 23;
        usuario2.nombre_titular_a_depositar = "Carlos Medina Juárez";
        usuario2.numero_cuenta_a_depositar = 1111122222;
        usuario2.edad_titular_a_depositar = 45;
        usuario2.saldo_titular_a_depositar = 800.00;

        //Se usan los métodos


        while (true) {
             String opcion_menu = JOptionPane.showInputDialog("Elija una opción del menú: \n" +
                    "1. Consultar saldo \n" +
                    "2. Ingresar efectivo \n" +
                    "3. Retirar efectivo \n" +
                    "4. Depositar \n"+
                    "5. Salir");

            if (opcion_menu == null || opcion_menu.equals("6")) {
                break;
            }



            switch(opcion_menu){

                case "1":

                    usuario1.Consultar_saldo();

                    break;
                case "2":
                    usuario1.Ingresar_efectivo();
                    break;
                case "3":
                    usuario1.retirar_efectivo();
                    break;

                case "5":
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");

            }


        }

    }
}

