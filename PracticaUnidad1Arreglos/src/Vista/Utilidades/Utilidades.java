/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Utilidades;

import Modelo.GeneroEnum;
import javax.swing.JComboBox;

/**
 *
 * @author David Campoverde
 */
public class Utilidades {
    
    public static JComboBox cargarComboGenero(JComboBox cbx){
        cbx.removeAllItems();
        for(GeneroEnum genero : GeneroEnum.values()){
            cbx.addItem(genero);
        }
        return cbx;
    }
    
    public static GeneroEnum getGenero(JComboBox cbx){
        return (GeneroEnum)cbx.getSelectedItem();
    }
    
}
