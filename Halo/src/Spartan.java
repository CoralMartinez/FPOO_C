public class Spartan {

    //Se presentan errores debido a que ahora los atributos son privados

    private String nombre;

    private int salud;

    private int escudo;

    private String arma_principal;

    public Spartan(String nombre, int salud, int escudo, String arma_principal) {
        this.nombre = nombre;
        this.salud = salud;
        this.escudo = escudo;
        this.arma_principal = arma_principal;
    }

  //Se generan los get y los sets

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public String getArma_principal() {
        return arma_principal;
    }

    public void setArma_principal(String arma_principal) {
        this.arma_principal = arma_principal;
    }


    //Métodos del Spartan

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

    private void consultaCortana(){
        System.out.println("Conversación privada");

    }



}//Llave de la clase
