/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Utilidades;

import Modelo.GeneroEnum;
import Modelo.Persona;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
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
    
    public static boolean guardarArchivoJSON(Persona[] personas){
        Gson gson = new Gson();
        String json = gson.toJson(personas);
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("dataJSON.json"))){
            bw.write(json);
            return true;
        } catch (Exception e) {
            System.out.println("Error"+e);
            return false;
        }    
        
    }
    
    public static Persona[] cargarArchivoJSON(){
        String json = "";
        Gson gson = new Gson();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("dataJSON.json"));
            String linea = "";
            while((linea = br.readLine()) != null){
                json += linea;
            }
            
            br.close();
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        
        Persona[] personas = gson.fromJson(json, Persona[].class);
        return personas;
    }
    
}
