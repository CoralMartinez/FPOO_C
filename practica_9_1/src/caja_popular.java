
import java.util.Scanner;


public class caja_popular {

    Scanner sca = new Scanner (System.in);

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

    double operacion_ingreso=0;

    double operacion_retirar=0;

    double operacion_depositar=0;


    //Métodos

    //Se muestran datos por eso se quitan lass variables del parámetro

    public void Consultar_saldo(){
        System.out.println("----------------Consultar saldo--------------------");
        System.out.println("Número de cuenta: "+numero_cuenta);
        System.out.println("Nombre del titular: "+nombre_titular);
        System.out.println("La cantidad de su saldo es de: "+saldo_titular);

    }

    //Se quita la variable numero_cuenta para recibir valor, porque debe solo de mostrarse

    public void Ingresar_efectivo(){
        System.out.println("----------------Ingresar efectivo--------------------");
        System.out.println("Número de cuenta: "+numero_cuenta);
        System.out.println("Su numero de cuenta es: "+numero_cuenta);
        System.out.println("¿Cuál es la cantidad que desea ingresar? ");
        cantidad_ingresar=sca.nextDouble();
        System.out.println("La cantidad a ingresar en efectivo es de: "+cantidad_ingresar);
        System.out.println("------Ingreso realizado con éxito------");

        operacion_ingreso = saldo_titular + cantidad_ingresar;

        System.out.println("Su saldo es de: "+operacion_ingreso);

    }

    //Se agrega una nueva variable

    //Se quitan variables que solo se deben de mostrar

    public void  retirar_efectivo(){
        System.out.println("----------------Retirar efectivo--------------------");
        System.out.println("Su numero de cuenta es: "+numero_cuenta);
        System.out.println("Su saldo es de: "+operacion_ingreso);
        System.out.println("¿Cuánto desea retirar? ");
        cantidad_retirar= sca.nextDouble();
        System.out.println("La cantidad que desea retirar es: "+cantidad_retirar);
        System.out.println("------Retiro realizado con éxito------");
        operacion_retirar= operacion_ingreso-cantidad_retirar;

        System.out.println("Su saldo es de: "+operacion_retirar);

    }

    public void Depositar_otracuenta(){
        System.out.println("----------------Depositar--------------------");
        System.out.println("Ingrese su numero de cuenta: "+numero_cuenta);
        System.out.println("Su saldo es de: "+operacion_retirar);
        System.out.println("Ingrese el numero de cuenta a despositar: ");
        numero_cuenta_a_depositar=sca.nextInt();

        if(numero_cuenta_a_depositar==1111122222){

            System.out.println("Nombre del cliente a despositar: "+nombre_titular_a_depositar);
            System.out.println("¿Cuál es la cantidad que desea depositar? ");
            cantidad_depositar=sca.nextDouble();
            System.out.println("La cantidad a depositar es: "+cantidad_depositar);
            System.out.println("------Depósito realizado con éxito------");
            operacion_depositar = operacion_retirar-cantidad_depositar;
            System.out.println("Su saldo es de: "+operacion_depositar);

        }

        else{

            System.out.println("No se ha encontrado el numero de cuenta ingresado: "+numero_cuenta_a_depositar);
        }


    }


}
