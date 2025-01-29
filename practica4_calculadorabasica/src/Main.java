import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Programa 5. Calculadora básica");

        Scanner sca = new Scanner(System.in);

        System.out.println("Ingresa un número entero");
        int num1 = sca.nextInt();

        System.out.println("Ingresa otro número entero");
        int num2 = sca.nextInt();

        System.out.println("Ingresa un operador (+, -, *, /) ");
        String operador = sca.next();

        switch(operador){

            case "+":
                System.out.println("Operador ingresado: "+operador+" operación a realizar: Suma");

                int suma= num1+num2;

                System.out.println("Resultado de la suma:  "+suma);

                break;

            case "-":
                System.out.println("Operador ingresado: "+operador+" operación a realizar: Resta");

                int resta= num1-num2;

                System.out.println("Resultado de la resta:  "+resta);

                break;


            case "*":
                System.out.println("Operador ingresado: "+operador+" operación a realizar: Multiplicación");

                int mult= num1*num2;

                System.out.println("Resultado de la multiplicación:  "+mult);

                break;

            case "/":
                System.out.println("Operador ingresado: "+operador+" operación a realizar: División");

                int div= num1/num2;

                System.out.println("Resultado de la división:  "+div);

                break;

            default:

                System.out.println("Ingresa un operador válido");

        }

    }
}