public class Main {
    public static void main(String[] args) {

        //SE CREA EL PRIMER OBJETO JEFE MAESTRO DE TIPO SPARTAN II

    spartan_II jefeMaestro =  new spartan_II("Luke", 100, "Rifle de asalto letal", 0);

    jefeMaestro.mostrarInfo(); // de la clase soldado y spartan
    jefeMaestro.usarManejoAvanzado();// de la clase spartan_II
    jefeMaestro.atacar("Constantine");// de la clase soldado
    jefeMaestro.recibirDano(50); // de la clase spartan
    jefeMaestro.recargarEscudo(); // de la clase spartan

        System.out.println("----------------------------------------------------------------");

        //SE CREA EL SEGUNDO OBJETO JEFE MAESTRO DE TIPO SPARTAN III
    spartan_III jefeMaestroIII = new spartan_III("Doromeo", 100, "Guadaña letal", 0);

    jefeMaestroIII.mostrarInfo();// de la clase soldado y spartan
    jefeMaestroIII.camuflajeActivo();// de la clase spartan_III
    jefeMaestroIII.atacar("Liang"); // de la clase soldado
    jefeMaestroIII.recibirDano(65); // de la clase spartan
    jefeMaestroIII.recargarEscudo(); // de la clase spartan

        System.out.println("----------------------------------------------------------------");

        //SE CREA EL TERCER OBJETO JEFE MAESTRO DE TIPO SPARTAN IV

        spartan_IV jefeMaestoIV = new spartan_IV( "Hou Yi", 93, "Ráfaga nocturna", 0);

        jefeMaestoIV.mostrarInfo();// de la clase soldado y spartan
        jefeMaestoIV.usaPropulsores();// de la clase spartan_IV
        jefeMaestoIV.atacar("Relfolger");// de la clase soldado
        jefeMaestoIV.recibirDano(45);// de la clase spartan
        jefeMaestoIV.recargarEscudo();// de la clase spartan

        System.out.println("----------------------------------------------------------------");

    }
}