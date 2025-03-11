import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        String[] options = {"Agregar Empleado", "Listar Empleados", "Salir"};
        int choice;

        do {
            choice = JOptionPane.showOptionDialog(null, "Elige una opción:", "Menú de Gestión de Empleados",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    agregarEmpleado(empleados);
                    break;
                case 1:
                    listarEmpleados(empleados);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa");
                    break;
                default:
                    break;
            }
        } while (choice != 2);
    }

    public static void agregarEmpleado(ArrayList<Empleado> empleados) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado:"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));

        String[] tipos = {"Conductor", "Administrativo"};
        int tipo = JOptionPane.showOptionDialog(null, "Elige el tipo de empleado:", "Tipo de Empleado",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tipos, tipos[0]);

        if (tipo == 0) {
            String licencia = JOptionPane.showInputDialog("Ingrese el tipo de licencia del conductor:");
            empleados.add(new Conductor(nombre, id, salario, licencia));
        } else if (tipo == 1) {
            String departamento = JOptionPane.showInputDialog("Ingrese el departamento del administrativo:");
            empleados.add(new Administrativo(nombre, id, salario, departamento));
        }
    }

    public static void listarEmpleados(ArrayList<Empleado> empleados) {
        if (empleados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
        } else {
            for (Empleado empleado : empleados) {
                empleado.mostrarInfo();
            }
        }
    }
}
