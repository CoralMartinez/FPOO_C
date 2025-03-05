public class spartan_IV extends spartan {

    public spartan_IV(String nombre, int salud, String arma, int escudo){

        super(nombre, salud, arma, 100);
    }

    public void usaPropulsores(){
        System.out.println("El Spartan "+nombre+" usa propulsores para moverse rápido");

    }

}
