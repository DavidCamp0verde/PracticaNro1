/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.modeloTabla;

import Modelo.Persona;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author David Campoverde
 */
public class ModeloTablaPersona extends AbstractTableModel{
    private Persona[] personas;

    @Override
    public int getRowCount() {
        return personas.length;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int i) {
        switch(i){
            case 0: return "Nombre";
            case 1: return "Genero";
            case 2: return "Edad (anios)";
            case 3: return "Clasificación";
            case 4: return "Indicaciones";
            default: return null;
        }
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Persona p = personas[i];
        switch(i1){
            case 0: return (p != null) ? (p.getNombres()+" "+p.getApellidos()) : "SIN DEFINIR";
            case 1: return (p != null) ? p.getGenero() : "SIN DEFINIR";
            case 2: return (p != null) ? p.getEdad().toString() : "SIN DEFINIR";
            case 3: return (p != null) ? p.getClasificacion() : "SIN DEFINIR";
            case 4: return (p != null) ? p.getPracticas() : "SIN DEFINIR";
            default: return null;
        }
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }
    
    
    
}
