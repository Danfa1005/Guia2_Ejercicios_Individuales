import java.util.Scanner; //Importar para teclado 

public class Actividad01
{
   public static void main (String[] args)
   {
       // Declarar variables
       double num, pie, cm, legua, yarda, pul;
       char letra;
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("Por favor ingrese caracter para conversion (en mayuscula)");
       System.out.println("P para pie, C para centimetro, L para legua y Y para yarda:");
       letra = teclado.next().charAt(0);
       
       System.out.println("Por favor ingrese numero a convertir:");
       num = teclado.nextDouble();
       
       //Instrucciones condicionales, calculo e impresion de resultados
       if (letra == 'P') {
           pul = num/0.0833;
           System.out.println("La conversion de pies a pulgadas son: " + pul + " pulgadas.");
       } //Fin del primer if
       else if (letra == 'C') {
           pul = num/2.54;
           System.out.println("La conversion de centimetros a pulgadas son: " + pul + " pulgadas.");    
       } //Fin del segundo if
       else if (letra == 'L') {
           pul = num*190080.02;
           System.out.println("La conversion de leguas a pulgadas son: " + pul + " pulgadas.");
       } //Fin del tercer if
       else {
           pul = num*36;
           System.out.println("La conversion de yardas a pulgadas son: " + pul + " pulgadas.");
       } //Fin del cuarto if
   } //Fin de main
   
} //Fin de la clase Actividad01
