/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaunidad1;

import Controlador.PersonaController;
import Modelo.Persona;

/**
 *
 * @author David Campoverde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona("Campoverde", "David", "25/03/2004");
        Persona p2 = new Persona("Intriago", "Gei", "25/03/1956");
        Persona p3 = new Persona("Sotooo", "Mauricio", "11/01/1988");
        Persona p4 = new Persona("Armijos", "Choclooo", "11/01/2015");
        Persona p5 = new Persona("Granda", "Rodolfo", "11/01/2000");
        Persona p6 = new Persona("Vacaaa", "Daniel", "11/01/2006");
        PersonaController pc = new PersonaController();
        pc.setPersona(p);
        
//        try {
//            System.out.println("Edad de "+p+": "+pc.calcularEdad()+" anios");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        
        PersonaController personasC = new PersonaController(7);
        
        
        personasC.agregarPersonaPosicion(p, 2);
        personasC.agregarPersonaPosicion(p2, 3);
        personasC.agregarPersonaPosicion(p3, 0);
        personasC.agregarPersonaPosicion(p4, 1);
        personasC.agregarPersonaPosicion(p6, 5);
        
        try {
            personasC.calcularEdades();
            personasC.imprimirArreglo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
