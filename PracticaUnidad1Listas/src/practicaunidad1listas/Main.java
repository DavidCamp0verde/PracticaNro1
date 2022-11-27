/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaunidad1listas;
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
        Persona p1 = new Persona("Campoverde", "David", "25/03/2004");
        Persona p2 = new Persona("Sotooo", "Mauricio", "11/01/2004");
        Persona p3 = new Persona("Messi", "Lionel", "24/06/1987");
        Persona p4 = new Persona("Ochoa", "Guillermo", "13/07/1985");
        Persona p5 = new Persona("Alfaro", "Gustavo", "25/03/1939");
        Persona p6 = new Persona("Ramirez", "Camila", "25/03/2016");
        
        
        
        PersonaController pc = new PersonaController();
        
        pc.calcularEdad(p1);
        pc.calcularEdad(p2);
        pc.calcularEdad(p3);
        pc.calcularEdad(p4);
        pc.calcularEdad(p5);
        pc.calcularEdad(p6);
        pc.getPersonas().insertar(p1);
        pc.getPersonas().insertar(p3);
        pc.getPersonas().insertar(p5);
        pc.getPersonas().insertar(p6);
        pc.getPersonas().imprimir();
        System.out.println(pc.getPersonas().getSize());
        pc.getPersonas().insertarCabecera(p2);
        pc.getPersonas().imprimir();
        System.out.println(pc.getPersonas().getSize());
        try {
            pc.getPersonas().insertarPosicion(p4, 3);
            pc.getPersonas().imprimir();
            System.out.println(pc.getPersonas().getSize());
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            pc.getPersonas().eliminar(5);
            pc.getPersonas().imprimir();
            System.out.println(pc.getPersonas().getSize());
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
    
}
