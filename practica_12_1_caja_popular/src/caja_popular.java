
import javax.swing.*;

public class caja_popular {

    //Atributos

    //Se cambia long int por int
    int id_administracioncuenta;
    int numero_cuenta;
    String nombre_titular;
    int edad_titular;
    //Se cambia float por double
    double saldo_titular;
    //Se agrega variable para obtener la cantidad a retirar

    double cantidad_retirar;

    //Se cambia long int por int
    int numero_cuenta_a_depositar;
    String nombre_titular_a_depositar;
    int edad_titular_a_depositar;
    //Se cambia float por double
    double saldo_titular_a_depositar;

    //Se cambia int por double y se coloca un nombre más específico
    double cantidad_ingresar;

    //Se agrega una variable para ingresar la cantidad a depositar
    double cantidad_depositar;

    //Se agregan 3 variables para realizar las operaciones de forma correcta

    double operacion_ingreso = 0;

    double operacion_retirar = 0;

    double operacion_depositar = 0;


    //Métodos

    //Se muestran datos por eso se quitan las variables del parámetro

    public void Consultar_saldo() {

        JOptionPane.showMessageDialog(null, "Consultar saldo"+"\n"+"Número de cuenta:"+numero_cuenta+"\n"+"Nombre del titular: " + nombre_titular+"\n"+
               "La cantidad de su saldo es de: " + saldo_titular );

    }

    //Se quita la variable numero_cuenta para recibir valor, porque debe solo de mostrarse

    public void Ingresar_efectivo(){

        JOptionPane.showMessageDialog(null, "Ingresar efectivo"+"\n"+"Número de cuenta:"+numero_cuenta);

        cantidad_ingresar=Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es la cantidad que desea ingresar? "));

        JOptionPane.showMessageDialog(null, "La cantidad a ingresar en efectivo es de:"+cantidad_ingresar+"\n");
        JOptionPane.showMessageDialog(null, "Ingreso realizado con éxito");

        operacion_ingreso = saldo_titular + cantidad_ingresar;

        JOptionPane.showMessageDialog(null, "Su saldo es de: "+operacion_ingreso);
    }



}

//String cantidadString = JOptionPane.showInputDialog("Introduce la cantidad a donar:");
//int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un" +
//  " numero para multiplicarlo por 2"));
