
/**
 * El dia de hoy se presentaron los Arreglos Unidimensionales (Arrays)
 * Se realizaron 3 ejercicios distintos, el primero era una suma de 10 numeros, el segundo numeros al azar, tercero son
 * Numeros que eran ingresador por el usuario
 * Y para terminar fue recorrer un string (esto ultimo como ayuda para la tarea PRA01)
 * Para probarlos quitar los // ubicados a la izquierda respetando el ejercicio indicado en el comentario a la derecha
 * Cualquier duda a sebastian.mendozag@usm.cl
 */
import java.util.Scanner;
import java.util.Random;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Random ran = new Random(); // Parte del ejercicio 2
        String palabra = "Seba";
        Scanner scan = new Scanner(System.in);
        int numeros[] = new int[10]; 
        //System.out.println("Ingrese 10 numeros: ");
        //for (int i=0; i < numeros.length; i++){
            // numeros[i] = i+1; // Parte del ejercicio 1
            // numeros[i] = i+ran.nextInt(100); // Parte del ejercicio 2
            //numeros[i] = scan.nextInt(); // Parte del ejercicio 3
    //}
        for (int i = 0; i<palabra.length(); i++ ){ // Parte del ejercicio 3
            char a = palabra.charAt(i); // Parte del ejercicio 4
            System.out.println(a); // Parte del ejercicio 4
        }
        //for (int numero : numeros) { // Parte del ejercicio 1, 2 y 3
            //System.out.print(numero + "," ); // Parte del ejercicio 1, 2 y 3
        //} //Parte del ejercicio 1, 2 y 3
    }
    
}
