import javax.swing.JOptionPane;


public class Administrativo extends Empleado {
    private String departamento;

    public Administrativo(String nombre, int id, double salario, String departamento) {
        super(nombre, id, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null,
                "Nombre: " + getNombre() + "\nID: " + getId() + "\nSalario: " + getSalario() +
                        "\nDepartamento: " + departamento);
    }
}
