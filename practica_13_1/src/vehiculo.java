import javax.swing.*;

public class vehiculo {

    //Constructor

    public vehiculo() {
        info_vehiculo();
        asignar_conductor();
    }

    //Atributos

    private String placa;
    private String modelo;
    private int capacidad_carga;
    private String conductor;
    private String nombre_conductor_asignado;

    //getters y setters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad_carga() {
        return capacidad_carga;
    }

    public void setCapacidad_carga(int capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getNombre_conductor_asignado(){
        return nombre_conductor_asignado;
    }

    public void setNombre_conductor_asignado(String nombre_conductor_asignado){
        this.nombre_conductor_asignado=nombre_conductor_asignado;
    }

    //MÉTODOS

   public void info_vehiculo(){
        this.placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo");
        this.modelo = JOptionPane.showInputDialog("Ingresa el modelo del vehículo");
        this.capacidad_carga = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso de carga"));
        this.conductor = conductor;

        JOptionPane.showMessageDialog(null, "Datos de registro de vehículo \n"+"Placa: "+placa+"\n"+"Modelo: "+modelo+"\n"+"Capacidad de carga: "+capacidad_carga+" kg");

    }

    public void asignar_conductor(){

        this.nombre_conductor_asignado= JOptionPane.showInputDialog("Ingrese el nombre del conductor asignado al vehículo: ");


    }




}
