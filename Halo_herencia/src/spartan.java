public class spartan extends soldado{

    private int escudo;

    public spartan(String nombre, int salud, String arma, int escudo){

         super(nombre, salud, arma);
        //no se declaran porque ya está en la clase "soldado"
        // y se llaman a través de la herencia

        this.escudo = escudo; //se añade un atributo
    }

    public void recargarEscudo(){

        escudo= 100;
        System.out.println("El Spartan "+nombre+" recargo su escudo al máximo");
    }

    @Override
    /*El override Java es una función de programación importante
    que permite a los programadores cambiar el comportamiento
    de una clase sin tener que cambiar su código fuente original.
    referencia:https://www.euroinnova.com/blog/latam/override-java#:~:text=El%20override%20Java%20es%20una,cambiar%20su%20c%C3%B3digo%20fuente%20original.
    */
    public void recibirDano(int dano){

        if(escudo >0){
            escudo-= dano;
            if(escudo<0){

                salud+= escudo;
                escudo = 0;

            }
            System.out.println("El Spartan "+nombre+" recibió daño. Escudo:" +escudo+" Salud: "+ salud );
        }

        else{
            super.recibirDano(dano);
        }
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
            System.out.println("Escudo: "+ this.escudo);
        }

}




