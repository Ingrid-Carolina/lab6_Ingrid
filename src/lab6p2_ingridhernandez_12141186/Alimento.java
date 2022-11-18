/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_ingridhernandez_12141186;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Alimento {
    private String Nombre;
    private int costo;
    private int calorias;
    private Categoria ca;

    public Alimento() {
    }

    public Alimento(String Nombre) {
        this.Nombre = Nombre;
    }

    public Alimento(String Nombre, int costo, int calorias, Categoria ca) {
        this.Nombre = Nombre;
        this.costo = costo;
        this.calorias = calorias;
        this.ca = ca;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public Categoria getCa() {
        return ca;
    }

    public void setCa(Categoria ca) {
        this.ca = ca;
    }

    @Override
    public String toString() {
        return "Alimento{" + "Nombre=" + Nombre + ", costo=" + costo + ", calorias=" + calorias + ", ca=" + ca + '}';
    }
    
}
