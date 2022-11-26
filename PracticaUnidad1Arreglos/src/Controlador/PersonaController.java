/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.FechaInvalidaException;
import Modelo.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author David Campoverde
 */
public class PersonaController {
    private static String Ncomun = "SIN DEFINIR";
    private Persona persona;
    private Persona[] personas;
    private Integer[] edades;

    public PersonaController() {
    }
    
    public PersonaController(Integer nroPersonas){
        this();
        personas = new Persona[nroPersonas];
        for (int i = 0; i < nroPersonas; i++) {
            Persona p = new Persona();
            p.setApellidos(Ncomun);
            p.setNombres(Ncomun);
            personas[i] = p;
        }
    }
    
    public boolean agregarPersona(Persona persona){
        if(persona != null){
            
            return true;
        }else{
            return false;
        }
    }
    
    public boolean agregarPersonaPosicion(Persona persona, Integer pos){
        if(persona != null){
            personas[pos] = persona;
            return true;
        }else{
            System.out.println("Agregue datos a la persona");
            return false;
        }
    }
    
    //Arreglo de edades
    public void calcularEdades() throws FechaInvalidaException{
        for (int i = 0; i < personas.length; i++) {
            
            if (personas[i].getFechaNacimiento() != null){
                calcularEdadPersona(personas[i]);
                
                if(personas[i].getEdad() <= 12){
                    personas[i].setClasificacion("NINIO");
                } else{
                    if(personas[i].getEdad() <= 18){
                        personas[i].setClasificacion("JOVEN");
                    }else if (personas[i].getEdad() <= 59){
                        personas[i].setClasificacion("ADULTO");
                    }else{
                        personas[i].setClasificacion("TERCERA EDAD");
                    }
                }
            } else{
                personas[i].setEdad(0);
            }
            
        }
//        determinarBuenasPracticas();
    }
    
    //Esto es para una sola persona
    public Integer calcularEdadPersona(Persona p) throws FechaInvalidaException{
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(p.getFechaNacimiento(), formatter);
        
        if(fechaNacimiento.isAfter(LocalDate.now())){
            throw new FechaInvalidaException();
        } else{
            Period edad = Period.between(fechaNacimiento, LocalDate.now());
            p.setEdad(edad.getYears());
        }
        return p.getEdad();
    }
    
//    public void determinarBuenasPracticas(){
//        for (int i = 0; i < personas.length; i++) {
//            if(personas[i].getFechaNacimiento()!=null){
//                if(personas[i].getClasificacion().equalsIgnoreCase("NINIO")){
//                    personas[i].setPracticas("PracticasNinio");
//                }else{
//                    if(personas[i].getClasificacion().equalsIgnoreCase("JOVEN")){
//                        personas[i].setPracticas("PracticasJoven");
//                    }else if(personas[i].getClasificacion().equalsIgnoreCase("ADULTO")){
//                        personas[i].setPracticas("PracticasAdulto");
//                    }else{
//                        personas[i].setPracticas("PracticasTerceraEdad");
//                    }
//                }
//            }else{
//                personas[i].setPracticas(Ncomun);
//            }
//        }
//    }
    
     public void imprimirArreglo(){
        for (Persona persona1 : personas) {
            System.out.println(persona1);
        }
    }
     
     public void imprimirEdades(){
         for (Persona persona1 : personas) {
            System.out.println(persona1.getEdad());
        }
     }
    
    
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }
    
    
    
}
