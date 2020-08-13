import java.util.Scanner; //Importar para teclado
import java.lang.Math; //Importar para PI

public class Actividad02
{
    public static void main (String[] args)
    {
        //Declarar variables
        double r, areaSom1, areaSom2;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese radio del circulo: ");
        r = teclado.nextDouble();
        
        //Calculo e impresion de resultados
        areaSom2 = (Math.PI-2)*(r*r);
        System.out.println("El area sombreada entre el circulo y  el cuadrado inscrito es: " + areaSom2);
    } //Fin de main
} //Fin de actividad02
