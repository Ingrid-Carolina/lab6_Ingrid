/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_ingridhernandez_12141186;

import java.util.ArrayList;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Jugadores {
    private String nombre;
    private String Usuario;
    private int nivel;
    private int Punto;
    private  Alimento alimento;
    private ArrayList<Jugadores> amigos =  new ArrayList();
    private ArrayList<Jugadores> solicitud = new ArrayList();
    private Billetera billetera;
    
    public Jugadores() {
    }

    public Jugadores(String nombre, String Usuario, int nivel, int Punto, Alimento alimento, Billetera billetera) {
        this.nombre = nombre;
        this.Usuario = Usuario;
        this.nivel = nivel;
        this.Punto = Punto;
        this.alimento = alimento;
        this.billetera = billetera;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPunto() {
        return Punto;
    }

    public void setPunto(int Punto) {
        this.Punto = Punto;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public ArrayList<Jugadores> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Jugadores> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<Jugadores> getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(ArrayList<Jugadores> solicitud) {
        this.solicitud = solicitud;
    }

    public Billetera getBilletera() {
        return billetera;
    }

    public void setBilletera(Billetera billetera) {
        this.billetera = billetera;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", Usuario=" + Usuario + ", nivel=" + nivel + ", Punto=" + Punto + ", alimento=" + alimento + ", amigos=" + amigos + ", solicitud=" + solicitud + ", billetera=" + billetera + '}';
    }
    
    
}
