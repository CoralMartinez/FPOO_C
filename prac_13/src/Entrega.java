import javax.swing.JOptionPane;


public class Entrega {
    private String numeroGuia;
    private String estado;

    public Entrega(String numeroGuia) {
        this.numeroGuia = numeroGuia;
        this.estado = "Pendiente";
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getEstado() {
        return estado;
    }

    public void actualizarEstado(String nuevoEstado) {
        if (nuevoEstado.equals("En tránsito") || nuevoEstado.equals("Entregado")) {
            this.estado = nuevoEstado;
        } else {
            JOptionPane.showMessageDialog(null, "Estado inválido. Los estados permitidos son: 'En tránsito' o 'Entregado'.");
        }
    }
}
