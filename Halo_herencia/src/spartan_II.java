public class spartan_II extends spartan {

    public spartan_II(String nombre, int salud, String arma, int escudo) {

        //SE USA EL CONSTRUCTOR DE SPARTAN

        super(nombre, salud, arma, 150);
    }

        public void usarManejoAvanzado(){

            System.out.println("El Spartan "+nombre+" tiene escudo extra y tácticas de combate avanzadas");

        }

}
