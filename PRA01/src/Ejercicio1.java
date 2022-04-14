

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nota, tiene un bug, si entras una url de este tipo "www.hola.com" dará problemas
 * @author Seba20xx
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> dominios = new ArrayList();
        dominios.add("cl"); dominios.add("com"); dominios.add("org"); dominios.add("net");
        ArrayList<Character> simbolosban = new ArrayList<>();
        simbolosban.add('?'); simbolosban.add('¿'); simbolosban.add('¡'); simbolosban.add('!'); simbolosban.add('!'); simbolosban.add('\"'); simbolosban.add('#');
        simbolosban.add('$'); simbolosban.add('%'); simbolosban.add('&'); simbolosban.add('('); simbolosban.add(')'); simbolosban.add('='); simbolosban.add('@'); 
        Scanner scan = new Scanner(System.in); 
        System.out.print("Validador de urls! \nPor favor ingresa tu url para verificar si cumple con los requisitos!\n");
        System.out.print("Dominios permitidos " + dominios + "\nSimbolos no permitidos " + simbolosban + " \nLa url debe contar con http:// y tener al menos 3 caracteres (sin contar dominio, punto ni http://)\n");
        System.out.print("URL INGRESADA: ");
        String url = scan.nextLine();
        boolean urlcorrecta = false;
        boolean tienesimboloban = false;
        do{
            if (url.contains("http://") == true){
                String urlsinhttp = url.replace("http://", "");
                if (dominios.contains(urlsinhttp.split("\\.")[1]) == true){
                    if (urlsinhttp.split("\\.")[0].length() >= 3){    
                        String urlpurasindominionihttp  = urlsinhttp.split("\\.")[0];
                            for (int i = 0; i<simbolosban.size(); i++ ){
                                tienesimboloban = false;
                                if (urlpurasindominionihttp.indexOf(simbolosban.get(i)) == 1){
                                    tienesimboloban = true;
                                    break;        
                                }
                            }if (tienesimboloban == true){
                                System.out.println("Url incorrecta, contiene un caracter no permitido, los cuales son " + simbolosban + " Intentelo nuevamente");
                                url = scan.nextLine();
                                
                            }else {
                                System.out.println("Url correcta, felicitaciones!");
                                urlcorrecta = true;
                            }
                
            }else{
                        System.out.println("Url incorrecta, es muy corta, debe tener al menos 3 caracteres (exceptuando http:// y el dominio, ingrese su url nuevamente");
                        url = scan.nextLine();
                        
                    }
        }else {
                    System.out.println("Url incorrecta, al menos su dominio no es válido, ingrese su url nuevamente");
                    url = scan.nextLine();
                }
        }else {
                System.out.println("Url incorrecta, al menos no contiene http://, ingresela nuevamente");
                url = scan.nextLine();
            }
        }while (urlcorrecta == false);      
    }
    }