
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



        System.out.println("Programa 3. Tablas de multiplicar del 1 al 10\n");

        int multi = 0;
        int multi2 = 0;
        int multi3 = 0;
        int multi4 = 0;


        System.out.println("Tabla de multiplicar del 1\n");

        for (int i = 1; i <= 10; i++) {

            multi = i * 1;

            System.out.println("1 * " + i +" = "+ multi);

        }

        System.out.println("\nTabla de multiplicar del 2\n");

        for (int i = 1; i <= 10; i++) {

            multi2 = i * 2;

            System.out.println("2 * " + i +" = "+ multi2);

        }

        System.out.println("\nTabla de multiplicar del 3\n ");

        for (int i = 1; i <= 10; i++) {

            multi3 = i * 3;

            System.out.println("3 * " + i +" = "+ multi3);

        }

        System.out.println("\nTabla de multiplicar del 4\n ");

        for (int i = 1; i <= 10; i++) {

            multi4 = i * 4;

            System.out.println("4 * " + i +" = "+ multi4);

        }



    }
}