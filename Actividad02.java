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
        areaCuadrado = (Math.sqrt(((r*r)/2)))*(Math.sqrt(((r*r)/2)));
        areaCirculo = Math.PI*(r*r);
        areaSombreada = areaCirculo - areaCuadrado;
        System.out.println("El area sombreada entre el circulo y  el cuadrado inscrito es: " + areaSombreada);
    } //Fin de main
} //Fin de actividad02
