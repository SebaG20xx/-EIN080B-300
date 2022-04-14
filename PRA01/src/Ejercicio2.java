/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Seba20xx
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numerousuario = scan.nextInt();
        int resultado = 0;
        String x = Integer.toString(numerousuario);
        while (numerousuario > 0) {
            resultado += numerousuario %10;
            numerousuario = numerousuario /10;
        }
        System.out.print("Cantidad de cífras: " + x.length() + "\nSuma de las cífras: " + resultado + "\n");
    }
}
