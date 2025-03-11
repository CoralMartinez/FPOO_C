import javax.swing.JOptionPane;



public class Envio {
    private String codigoEnvio;
    private String destino;
    private double peso;

    public Envio(String codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
    }

    public Envio(String codigoEnvio, String destino, double peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }

    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public void setCodigoEnvio(String codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static Envio crearEnvio() {
        String codigoEnvio = JOptionPane.showInputDialog("Ingrese el código del envío:");
        String destino = JOptionPane.showInputDialog("Ingrese el destino del envío:");
        String[] opciones = {"Sí", "No"};
        int opcion = JOptionPane.showOptionDialog(null, "¿Desea ingresar el peso del envío?", "Peso del Envío",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        if (opcion == 0) {
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del envío:"));
            return new Envio(codigoEnvio, destino, peso);
        } else {
            return new Envio(codigoEnvio, destino);
        }
    }
}
