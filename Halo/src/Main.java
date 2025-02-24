//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

   // Se crea el primer objeto = Instanciar objeto


        Spartan jefe_maestro = new Spartan("John", 100, 90, "Asalto letal");

        // Se crea el segundo objeto = Instanciar objeto

        Spartan reach = new Spartan("Eleanor", 0, 0, "Metralladora");

        //Se usan los métodos

        jefe_maestro.mostrarInfo();
        jefe_maestro.atacar("Lux");
        jefe_maestro.recargarArma(47 );
        jefe_maestro.correr( true);

        reach.mostrarInfo();
        reach.atacar( "Alex");
        reach.recargarArma( 8);
        reach.correr(false);

        jefe_maestro.setNombre("Luciana Wodd");
        jefe_maestro.mostrarInfo();
        System.out.println(jefe_maestro.getNombre());

    }

}//Llave de la clase principal


