/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author Seba20xx
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList lista = new ArrayList(); //Ejemplo 1
        ArrayList<String> palabras = new ArrayList(); //Ejemplo 2
        lista.add(1); //Ejemplo 1
        lista.add("dos"); //Ejemplo 1
        lista.add('3'); //Ejemplo 1
        lista.add(4.0); //Ejemplo 1
        System.out.println(lista + " Ejemplo 1."); //Ejemplo 1
        
        
        palabras.add("Hola"); //Ejemplo 2
        palabras.add("JAJAJA"); //Ejemplo 2
        palabras.add("Ronaldinho Soccer"); //Ejemplo 2
        palabras.add(0,"cero"); //Ejemplo 2
        System.out.println(palabras); //Ejemplo 2
        String palabra = palabras.get(0); //Ejemplo 2
        System.out.println("Get: " + palabra); //Ejemplo 2
        System.out.println(palabras); //Ejemplo 2
        int maximopalabras = palabras.size(); //Ejemplo 2
        palabra = palabras.remove(maximopalabras -1 ); //Ejemplo 2 (Ejercicio de eliminar el ultimo elemento)
        System.out.println("Get: " + palabra); //Ejemplo 2
        System.out.println(palabras); //Ejemplo 2
        System.out.println("Hay " + palabras.size() + " palabras en la columna");//Ejemplo 2
        
        System.out.println(palabras.isEmpty()); // Ejemplo 3
        palabras.clear(); //Ejemplo 3
        System.out.println(palabras.isEmpty()); // Ejemplo 3
        System.out.println(palabras); // Ejemplo 3
    }
    
}
