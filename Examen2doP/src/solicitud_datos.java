import javax.swing.*;

public class solicitud_datos {

    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private String ano_nacimiento;
    private String carrera;

    public solicitud_datos(String nombre, String apellido_p, String apellido_m, String ano_nacimiento, String carrera) {
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.ano_nacimiento = ano_nacimiento;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    public String getApellido_m() {
        return apellido_m;
    }

    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    public String getAno_nacimiento() {
        return ano_nacimiento;
    }

    public void setAno_nacimiento(String ano_nacimiento) {
        this.ano_nacimiento = ano_nacimiento;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }


    //Método que solicita los datos y los guarda en las variables correspondientes

    public void solicitar_guardar_datos() {
        nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        apellido_p = JOptionPane.showInputDialog("Ingrese su apellido paterno");
        apellido_m = JOptionPane.showInputDialog("Ingrese su apellido materno");
        ano_nacimiento= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento "));
        carrera= JOptionPane.showInputDialog("Ingrese su carrera");


    }
    //Método que muestra los datos guardados

    public void mostrar_datos() {
        JOptionPane.showMessageDialog(null,
                "Nombre: " + getNombre() + "\nApellido Paterno: " + getApellido_p() +
                        "\nApellido Materno: " + getApellido_m() + "\n Año de nacimiento: "+getAno_nacimiento()+
                        "\nCarrera: " + getCarrera()
                );
    }

    public void crear_matricula(){

        //System.out.println(nombre.substring(2));
        String sustraer_n =(nombre.substring(1,3)); //Iván
        String sustraer_ap =(apellido_p.substring(2,5)); //Guerra
        String sustraer_am =(apellido_m.substring(2,4)); //López
        String sustraer_an =(ano_nacimiento.substring(0,1)); //1987
        String sustraer_c =(carrera.substring(3,7)); //Sistemas



        JOptionPane.showMessageDialog(null, "Nombre: "+ sustraer_n+
                "Apellido Paterno:"+ sustraer_ap+
                "Apellido Paterno:"+ sustraer_am+
                "Año de nacimiento:"+ sustraer_an+
                "Carrera:"+ sustraer_c
        );


    }



}
