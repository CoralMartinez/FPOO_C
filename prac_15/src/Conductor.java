import javax.swing.JOptionPane;


public class Conductor extends Empleado {
    private String licencia;

    public Conductor(String nombre, int id, double salario, String licencia) {
        super(nombre, id, salario);
        this.licencia = licencia;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    @Override
    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null,
                "Nombre: " + getNombre() + "\nID: " + getId() + "\nSalario: " + getSalario() +
                        "\nLicencia: " + licencia);
    }
}
