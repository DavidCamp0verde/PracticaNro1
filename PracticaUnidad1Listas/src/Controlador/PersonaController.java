/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Controlador.ListaEnlazada.ListaEnlazada;
import Modelo.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author David Campoverde
 */
public class PersonaController {
    private ListaEnlazada<Persona> personas = new ListaEnlazada<>();
    
    public PersonaController(){
        
    }
    
    public void calcularEdadesLista(){
        for(int i = 0; i < personas.getSize(); i++){
            
        }
    }
    
    public void calcularEdad(Persona p){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(p.getFechaNacimiento(), formatter);
        
        if(fechaNacimiento.isAfter(LocalDate.now())){
            System.out.println("Fecha no valida");
        } else{
            Period edad = Period.between(fechaNacimiento, LocalDate.now());
            p.setEdad(edad.getYears());
            clasificar(p);
        }
    }
    
    public void clasificar(Persona p){
        Integer edad = p.getEdad();
        if(edad <= 12){
            p.setClasificacion("NINIO");
        }else{
            if(edad <= 18){
                p.setClasificacion("JOVEN");
            }else if(edad <= 59){
                p.setClasificacion("ADULTO");
            }else{
                p.setClasificacion("TERCERA EDAD");
            }
        }
    }

    public ListaEnlazada<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ListaEnlazada<Persona> personas) {
        this.personas = personas;
    }
    
    
    
}
