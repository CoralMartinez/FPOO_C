//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {


        // Se crea el objeto = Instanciar objeto

        Spartan jefe_maestro = new Spartan();

        // Se crea otro objeto = Instanciar objeto

        Spartan reach = new Spartan();


        //Se asignan atributos al objeto

        jefe_maestro.nombre = "John";

        jefe_maestro.salud = 100;

        jefe_maestro.escudo = 90;

        jefe_maestro.arma_principal = "Asalto letal";


        //Se usan los métodos

        jefe_maestro.mostrarInfo();
        jefe_maestro.atacar("Lux");
        jefe_maestro.recargarArma(47 );
        jefe_maestro.correr( true);



        //Se crea el segundo objeto, es decir, otro personaje

        reach.nombre = "Eleanor";
        reach.salud = 10;
        reach.escudo = 0;
        reach.arma_principal = "Metralladora";

        reach.mostrarInfo();
        reach.atacar( "Alex");
        reach.recargarArma( 8);
        reach.correr(false);

    }

}//Llave de la clase principal