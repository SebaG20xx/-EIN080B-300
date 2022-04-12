/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Seguir también la clase persona.java, ya que empezamos la programación orientada a objetos
 * @author Seba20xx
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p = new Persona();
        Persona p1 = new Persona();
        p.rut = "92331632-9";
        p.nombre = "Juan";
        p.apellido = "Connor";
        
        p1.rut = "48029001-10";
        p1.nombre = "T-800";
        p1.apellido = "Schwarzenegger";
        //Llamados a los atributos sin funcion
        System.out.print("Skynet te ordena matar a " + p.nombre + " " + p.apellido + " \n");
        System.out.print("Vive en Chile, su RUT para facilitar la localización es " + p.rut + " \n");
        System.out.println("Pero ten cuidado, la resistencia ha enviado al terminator reprogramado cuyo nombre es");
        System.out.print(p1.nombre + " " + p1.apellido + ", su rut es " + p1.rut + "\n");
        //Llamados a los atributos con funcion definida en la clase Persona
        System.out.println("Llamados con funcion definida");
        System.out.println(p.saludar());
        System.out.println(p1.saludar());
    }
    
}
