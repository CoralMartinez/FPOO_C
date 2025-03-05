public class spartan_III extends spartan{


    public spartan_III(String nombre, int salud, String arma, int escudo){

        super(nombre, salud, arma, 80);

    }

    public void camuflajeActivo(){
        System.out.println("El Spartan "+nombre+" cuenta con camuflaje para invisibilidad");

    }

}
