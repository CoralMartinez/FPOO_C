//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {


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

        usuario2.id_administracioncuenta  = 23;
        usuario2.nombre_titular_a_depositar = "Carlos Medina Juárez";
        usuario2.numero_cuenta_a_depositar = 1111122222;
        usuario2.edad_titular_a_depositar = 45;
        usuario2.saldo_titular_a_depositar= 800.00;

        //Se usan los métodos



        usuario1.Consultar_saldo();
        usuario2.Consultar_saldo();
        usuario1.Ingresar_efectivo();
        usuario1.retirar_efectivo();
        usuario1.Depositar_otracuenta();





    }
} //Llave Main