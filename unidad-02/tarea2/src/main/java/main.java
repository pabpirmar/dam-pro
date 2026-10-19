import java.util.Scanner;

 public class main {
     /**
      * @author Pablo Piriz Martin
      * @version 1.0.0
      */

     public static void main(String[] args) {

         float kilómetros = 0;
         float metros = 0;
         Scanner teclado = new Scanner(System.in);
         float resultado = 0;


         System.out.println("====================================\n" +
                 "         CONVERSOR DAM-PRO\n" +
                 "====================================");

         System.out.println("Introduzca su nombre: ");
         String nombre = teclado.nextLine();

         System.out.println("1. Kilómetros a metros");
         System.out.println("2. Metros a centímetros");
         System.out.println("3. Kilómetros a millas");
         System.out.println("4. Salir");
         System.out.println("Seleccione una opción: ");

         int opcion = teclado.nextInt();
         teclado.nextLine();
         int contador = 0;

         switch (opcion) {

             case 1:
                 System.out.println("Introduzca los kilómetros: ");
                 kilómetros = teclado.nextFloat();
                 resultado = KilómetrosMetros(kilómetros);
                 break;
             case 2:
                 System.out.println("Introduzca los metros");
                 metros = teclado.nextFloat();
                 resultado = MetrosCentímetros(metros);
                 break;
             case 3:
                 System.out.println("Introduzca los kilómetros");
                 kilómetros = teclado.nextFloat();
                 resultado = KilómetrosMillas(kilómetros);
                 break;
         }
         System.out.println("El resultado es: " +resultado);





     }

     public static float KilómetrosMetros(float kilometros) {
         return kilometros * 1000;
     }

     public static float MetrosCentímetros(float metros) {
         return metros * 100;
     }

     public static float KilómetrosMillas(float kilómetros) {
         return (float) (kilómetros * 0.621371);
     }
 }