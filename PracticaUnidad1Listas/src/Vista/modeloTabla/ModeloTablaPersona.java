/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.modeloTabla;

import Controlador.ListaEnlazada.ListaEnlazada;
import Controlador.PersonaController;
import Modelo.Persona;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author David Campoverde
 */
public class ModeloTablaPersona extends AbstractTableModel{
    private PersonaController listaPersonas;
    
    @Override
    public int getRowCount() {
        return listaPersonas.getPersonas().getSize();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0: return "Nombre";
            case 1: return "Genero";
            case 2: return "Edad (anios)";
            case 3: return "Clasificación";
            case 4: return "Indicaciones";
            default:return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Persona p = null;
        try {
            p = listaPersonas.getPersonas().obtener(rowIndex);
        } catch (Exception e) {
        }
        
        switch(columnIndex){
            case 0: return (p != null) ? (p.getNombres()+" "+p.getApellidos()) : "SIN DEFINIR";
            case 1: return (p != null) ? p.getGenero() : "SIN DEFINIR";
            case 2: return (p != null) ? (p.getEdad().toString()): "SIN DEFINIR";
            case 3: return (p != null) ? p.getClasificacion(): "SIN DEFINIR";
            case 4: return (p != null) ? p.getPracticas(): "SIN DEFINIR";
            default:return null;
        }
    }

    public PersonaController getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(PersonaController listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    

    
    
    
    
}
