import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        ArrayList<Conductor> conductores = new ArrayList<>();
        ArrayList<Envio> envios = new ArrayList<>();
        ArrayList<Entrega> entregas = new ArrayList<>();

        String[] opcionesMenu = {"Agregar Vehículo", "Agregar Conductor", "Registrar Envío", "Asignar Conductor a Vehículo", "Actualizar Estado de Entrega", "Salir"};
        int opcion;

        do {
            opcion = JOptionPane.showOptionDialog(null, "Elige una opción:", "Menú de Gestión de Transporte",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesMenu, opcionesMenu[0]);

            switch (opcion) {
                case 0:
                    agregarVehiculo(vehiculos);
                    break;
                case 1:
                    agregarConductor(conductores);
                    break;
                case 2:
                    registrarEnvio(envios);
                    break;
                case 3:
                    asignarConductorAVehiculo(vehiculos, conductores);
                    break;
                case 4:
                    actualizarEstadoEntrega(entregas);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    break;
                default:
                    break;
            }
        } while (opcion != 5);
    }

    public static void agregarVehiculo(ArrayList<Vehiculo> vehiculos) {
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        double capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga del vehículo:"));

        Vehiculo vehiculo = new Vehiculo(placa, modelo, capacidadCarga);
        vehiculos.add(vehiculo);
    }

    public static void agregarConductor(ArrayList<Conductor> conductores) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
        String identificacion = JOptionPane.showInputDialog("Ingrese la identificación del conductor:");
        String licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor:");

        Conductor conductor = new Conductor(nombre, identificacion, licencia);
        conductores.add(conductor);
    }

    public static void registrarEnvio(ArrayList<Envio> envios) {
        Envio envio = Envio.crearEnvio();
        envios.add(envio);
    }

    public static void asignarConductorAVehiculo(ArrayList<Vehiculo> vehiculos, ArrayList<Conductor> conductores) {
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo al que desea asignar un conductor:");
        Vehiculo vehiculoSeleccionado = null;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                vehiculoSeleccionado = vehiculo;
                break;
            }
        }

        if (vehiculoSeleccionado != null) {
            String identificacion = JOptionPane.showInputDialog("Ingrese la identificación del conductor a asignar:");
            Conductor conductorSeleccionado = null;
            for (Conductor conductor : conductores) {
                if (conductor.getIdentificacion().equals(identificacion)) {
                    conductorSeleccionado = conductor;
                    break;
                }
            }

            if (conductorSeleccionado != null) {
                vehiculoSeleccionado.asignarConductor(conductorSeleccionado);
            } else {
                JOptionPane.showMessageDialog(null, "Conductor no encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vehículo no encontrado.");
        }
    }

    public static void actualizarEstadoEntrega(ArrayList<Entrega> entregas) {
        String numeroGuia = JOptionPane.showInputDialog("Ingrese el número de guía de la entrega:");
        Entrega entregaSeleccionada = null;
        for (Entrega entrega : entregas) {
            if (entrega.getNumeroGuia().equals(numeroGuia)) {
                entregaSeleccionada = entrega;
                break;
            }
        }

        if (entregaSeleccionada != null) {
            String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (En tránsito, Entregado):");
            entregaSeleccionada.actualizarEstado(nuevoEstado);
        } else {
            JOptionPane.showMessageDialog(null, "Entrega no encontrada.");
        }
    }
}
