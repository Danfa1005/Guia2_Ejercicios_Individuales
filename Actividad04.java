import java.util.Scanner; //Importar para teclado

public class Actividad04
{
   public static void main (String[] args)
   {
       //Declarar variables
       String tipVehi;
       int precBruto, impPaga, precNeto;
       Scanner teclado = new Scanner(System.in);
       
       System.out.print("Ingrese tipo de vehiculo (camioneta o automóvil): ");
       tipVehi = teclado.nextLine();
       
       System.out.print("Ingrese precio bruto del vehiculo:");
       precBruto = teclado.nextInt();
       
       //Instrucciones condicionales, calculo e impresion de resultados
       if ((tipVehi.equals("Camioneta") || tipVehi.equals("camioneta"))  && (precBruto < 80)) {
           impPaga = 0;
           System.out.println("El impuesto a pagar de la camioneta es de: " + impPaga + " pesos.");
           precNeto = precBruto + impPaga;
           System.out.println("El precio neto de la camioneta es de: " + precNeto + " pesos.");
       } //Fin del primer if
       else if ((tipVehi.equals("Camioneta") || tipVehi.equals("camioneta")) && (precBruto >= 80)) {
           impPaga = precBruto/2;
           System.out.println("El impuesto a pagar de la camioneta es de: " + impPaga + " pesos.");
           precNeto = precBruto + impPaga;
           System.out.println("El precio neto de la camioneta es de: " + precNeto + " pesos.");
       } //Fin del segundo if
       else if ((tipVehi.equals("Automóvil") || tipVehi.equals("automóvil") 
                || tipVehi.equals("Automovil") || tipVehi.equals("automovil")) 
                && (precBruto < 20)) {               
           impPaga = 5;
           System.out.println("El impuesto a pagar del automóvil es de: " + impPaga + " pesos.");
           precNeto = precBruto + impPaga;
           System.out.println("El precio neto del automóvil es de: " + precNeto + " pesos.");
       } //Fin del tercer if
       else if ((tipVehi.equals("Automóvil") || tipVehi.equals("automóvil") 
                || tipVehi.equals("Automovil") || tipVehi.equals("automovil")) 
                && (precBruto >= 20 && precBruto<=40)) {
           impPaga = precBruto/5;
           System.out.println("El impuesto a pagar del automóvil es de: " + impPaga + " pesos.");
           precNeto = precBruto + impPaga;
           System.out.println("El precio neto del automóvil es de: " + precNeto + " pesos.");
       } //Fin del cuarto if
        else if ((tipVehi.equals("Automóvil") || tipVehi.equals("automóvil") 
                || tipVehi.equals("Automovil") || tipVehi.equals("automovil")) 
                && (precBruto > 40)) {
           impPaga = 9;
           System.out.println("El impuesto a pagar del automóvil es de: " + impPaga + " pesos.");
           precNeto = precBruto + impPaga;
           System.out.println("El precio neto del automóvil es de: " + precNeto + " pesos.");
       } //Fin del quinto if
   } //Fin de main
} //Fin de actividad04
