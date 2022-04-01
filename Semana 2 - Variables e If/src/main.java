/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Seba20xx
 */
import java.util.Scanner;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in); 
        String nombre = "Seba20xx";
        System.out.println("Mi nombre es " + nombre);
        int precio;
        System.out.print("Ingrese el valor para calcular su valor + iva: ");
        precio = read.nextInt();
        float iva = 0.19f;
        int total = (int) (precio + precio * iva);
        //System.out.println("El valor del estadio de la u es (Sin IVA): " + precio);
        System.out.println("Valor + IVA es igual a: " + total);

        // TODO code application logic here

        char licencia;
        System.out.print("Inserte la letra de su licencia : ");
        licencia = read.next().charAt(0);

        
        switch (licencia) {
            case 'b':
                System.out.println("Usted es conductor de autos");
                break;
            case 'c':
                System.out.println("Usted es conductor de moto");
                break;
            case 'd':
                System.out.println("Usted es conductor de Maquinaria Pesada");
                break;
            default:
                System.out.println("Error 404 not found");
                break;
        }

    }
}
