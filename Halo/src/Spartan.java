public class Spartan {

    public String nombre;

    int salud;

    int escudo;

    String arma_principal;


    //Métodos del Spartam

    public void mostrarInfo(){

        System.out.println("---------------------Información del Spartan---------------------");

        System.out.println("Nombre: "+nombre);
        System.out.println("Salud: "+salud);
        System.out.println("Escudo: "+escudo);
        System.out.println("Arma principal: "+arma_principal);
        System.out.println("-----------------------------------------------------------------");

    }


    public void atacar(String enemigo){

        System.out.println(nombre+" ataca a "+enemigo+" con "+arma_principal);

    }

    public void recargarArma(int municiones){

        int restante = 10;

        int total= restante+municiones;

        System.out.println("El arma "+arma_principal+ " tiene "+ total+ " balas");

    }


    public void correr(boolean status){


        if(status){

            System.out.println("El spartan "+nombre+"  está corriendo");

        }

        else{

            System.out.println("El spartan "+nombre+" se detuvo");
        }

    }


}//Llave de la clase
