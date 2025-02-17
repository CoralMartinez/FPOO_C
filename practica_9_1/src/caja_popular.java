
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


    //Métodos

    //Se muestran datos por eso se quitan lass variables del parámetro

    public void Consultar_saldo(){
        System.out.println("----------------Consultar saldo--------------------");
        System.out.println("Número de cuenta: "+numero_cuenta);
        System.out.println("Nombre del titular: "+nombre_titular);
        System.out.println("La cantidad de su saldo es de: "+saldo_titular);

    }

    //Se quita la variable numero_cuenta para recibir valor, porque debe solo de mostrarse

    public void Ingresar_efectivo(double cantidad_ingresar){
        System.out.println("----------------Ingresar efectivo--------------------");
        System.out.println("Número de cuenta: "+numero_cuenta);
        System.out.println("Su numero de cuenta es: "+numero_cuenta);
        System.out.println("La cantidad a ingresar en efectivo es de: "+cantidad_ingresar);

    }

    //Se agrega una nueva variable

    //Se quitan variables que solo se deben de mostrar

    public void  retirar_efectivo(double cantidad_retirar){
        System.out.println("----------------Retirar efectivo--------------------");
        System.out.println("Su numero de cuenta es: "+numero_cuenta);
        System.out.println("Su saldo es de: "+saldo_titular);
        System.out.println("¿Cuánto desea retirar? "+cantidad_retirar);

    }

    public void Depositar_otracuenta(double cantidad_depositar){
        System.out.println("----------------Depositar--------------------");
        System.out.println("Ingrese su numero de cuenta: "+numero_cuenta);
        System.out.println("Su saldo es de: "+saldo_titular);
        System.out.println("Ingrese el numero de cuenta a despositar: "+numero_cuenta_a_depositar);
        System.out.println("Ingrese la cantidad a depositar: "+cantidad_depositar);

    }


}
