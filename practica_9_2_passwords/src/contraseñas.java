import java.util.Scanner;




/*

   1. El problema es:

Realizar una aplicación que genere password automáticos, solicitara
al usuario la longitud (8 caracteres por default), si quiere incluir
Mayúsculas o Caracteres especiales, dentro de las opciones que
tendrá agregar una para comprobar fortaleza del password.

   2. Se debe de utilizar JOptionPane

   3. Se debe de ingresar cualquier tipo de contraseña


   4. Atributos:

      a) Int: id_password_automatico
      b) Int: longitud (mínimo 8 caracteres)
      c) String: mayuscula_caracterespecial;
      d) Char respuesta = S


   5. Métodos

      a) Crear contraseña

      b) Verificar contraseña  (fortaleza de la contraseña/password, si la longitud tiene mínimo 8 caracteres
      y si tienen mayúsculas o carácteres especiales (si la contraseña solo tiene números, pero no tiene mayúsculas
      ni carácteres especiales la contraseña tiene una fortaleza baja, si la contraseña tiene números
      y mayúsculas, tiene una fortaleza intermedia, si la contraseña tiene números, mayúsculas
      y carácteres especiales, tiene una fortaleza alta.



*/


public class contraseñas {

Scanner sr = new Scanner (System.in);
    //Atributos

int id_password_automatico;

//Se cambia la variable el tipo de la variable String longitud por int

int longitud=8;

String mayuscula_caracterespecial;

String password;

String respuesta= "S";

//Métodos

    public void crear_password(){


        System.out.println("Ingresa la longitud de la contraseña");
        longitud = sr.nextInt();
        System.out.println("¿Deseas agregar mayúsculas o caracteres especiales? Si: S No: N");
        respuesta = sr.nextLine();

        if(respuesta == "S"){

            System.out.println("Ingresa las mayúsculas o los caracteres especiales: ");

            mayuscula_caracterespecial=sr.nextLine();

            System.out.println("Ingresa los valores para tu generar tu contraseña");
            password=sr.nextLine();
        }

        else{

            System.out.println("Ingresa los valores para tu generar tu contraseña");
            password=sr.nextLine();

        }


        public void verificar_password(){

            if((longitud<=8) && (mayuscula_caracterespecial=="LS#"))
            {
                System.out.println("Su ID es:"+ id_password_automatico);
                System.out.println("Su contraseña tiene la longitud permitida. Contraseña"+password);
            }

            else{
                System.out.println("Su ID es:"+ id_password_automatico);
                System.out.println("Su contraseña no tiene la longitud, las maýusculas ni los carácteres especiales permitidos. Contraseña: "+password);
            }


        }


    }//LLave fin clase








}
