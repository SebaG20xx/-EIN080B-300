/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Seba20xx
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        //persona.rut = "62791979-4;  //Codigo no valido al ser privados los atributos
        persona.setRut("62791979-4");
        persona.setNombre("Juan");
        persona.setApellido("Connor");
        
        System.out.println(persona.saludar());
    }
    
}
