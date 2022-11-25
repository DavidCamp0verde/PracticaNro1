/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author David Campoverde
 */
public class FechaInvalidaException extends Exception{
    
    public FechaInvalidaException(String msg){
        super(msg);
    }
    
    public FechaInvalidaException(){
        super("La fecha ingresada no es valida");
    }
    
}
