import javax.swing.*;


public class solicitud {


    private int numero;
    private String numero_2;



    public solicitud(int numero, String numero_2) {
        this.numero = numero;
        this.numero_2 = numero_2;
    }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNumero_2() {
        return numero_2;
    }

    public void setNumero_2(String numero_2) {
        this.numero_2 = numero_2;
    }









    //Método que solicita los números

    public void solicitar_numeros_arabigos() {

        int numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número del 1 al 50"));

        if(numero>=1 && numero<=50){

            switch (numero)
            {
                case 1:
                    JOptionPane.showMessageDialog(null, "Número ingresado:"+numero+" Número Romano: I");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Número ingresado:"+numero+" Número Romano: II");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Número ingresado:"+numero+" Número Romano: III");
                    break;



                default:

                    JOptionPane.showMessageDialog(null, "Introduzca un número válido");
            }

        }

    }


    public void solicitar_numeros_romanos() {


        int numero_2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número del 1 al 50"));


        numero_2 = JOptionPane.showInputDialog("Ingrese una letra");

        if(numero_2>=1 && numero_2<=50){

            switch (numero_2)
            {
                case 1:
                    JOptionPane.showMessageDialog(null, "Número ingresado:"+numero+" Número Romano: I");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Número ingresado:"+numero+" Número Romano: II");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Número ingresado:"+numero+" Número Romano: III");
                    break;



                default:

                    JOptionPane.showMessageDialog(null, "Introduzca un número válido");
            }

        }

    }



}
