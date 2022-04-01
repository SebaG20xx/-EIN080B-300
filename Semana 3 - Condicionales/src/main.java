/**
 *
 * @author Seba20xx
 */
import java.util.Scanner;
import java.util.Random;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 0;
        int max = 20;
        Random random = new Random();
        int numeroganador = random.nextInt(max + min);
        System.out.println(numeroganador);
        System.out.println("Ingrese un numero, si es el generado ganara mil millones de dolares :");
        int numerousuario = scan.nextInt();
        int contadorintentos = 1;
        int intentos = 3;
        boolean ganador = false;
        do {
                if (numerousuario == numeroganador){
                   System.out.println("GANASTE! Te tomo solo " + contadorintentos + " intento(s)");
                   ganador = true;
                   break;
                }else if (numerousuario < numeroganador){
                    int intentosrestantes = intentos - contadorintentos;
                    System.out.println("Fallaste, te quedan solo " + intentosrestantes + " intento(s).");
                    System.out.println("Pero hey, el numero ingresado es menor que el numero generado intenta otra vez");
                    contadorintentos = contadorintentos + 1;
                    numerousuario = scan.nextInt();
                }else if (numerousuario > numeroganador) {
                    int intentosrestantes = intentos - contadorintentos;
                    System.out.println("Fallaste, te quedan solo " + intentosrestantes + " intento(s).");
                    System.out.println("Pero hey, el numero ingresado es mayor que el numero generado, intenta otra vez");
                    contadorintentos = contadorintentos + 1;
                    numerousuario = scan.nextInt();
            }
       
    }while (contadorintentos != 3);
        if (ganador == true) {
            System.out.println("Lo has logrado! Felicidades, muchas gracias por probar este codigo");
        }else {
            System.out.println("Lamentablemente no lo has podido adivinar, pero animate a intentarlo nuevamente!");
        }
       
}        
}    
 