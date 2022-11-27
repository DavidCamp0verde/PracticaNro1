/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author David Campoverde
 */
public class Persona {
    private Integer edad = 0;
    private GeneroEnum genero;
    private String apellidos;
    private String nombres;
    private String fechaNacimiento;
    private String clasificacion;
    private String practicas;

    public Persona() {
    }

    public Persona(String apellidos, String nombres) {
        this();
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    public Persona(String apellidos, String nombres, String fechaNacimiento) {
        this(apellidos, nombres);
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public GeneroEnum getGenero() {
        return genero;
    }

    public void setGenero(GeneroEnum genero) {
        this.genero = genero;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getPracticas() {
        return practicas;
    }

    public void setPracticas(String practicas) {
        this.practicas = practicas;
    }

    @Override
    public String toString() {
        return this.getNombres() + " "+this.getApellidos() + " - " + this.getEdad() + " anios"+" - " +this.clasificacion;
    }
    
    
}
