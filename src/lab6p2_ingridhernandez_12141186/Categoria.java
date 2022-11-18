/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_ingridhernandez_12141186;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Categoria {
    private String cat;

    public Categoria() {
    }

    public Categoria(String cat) {
        this.cat = cat;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return cat ;
    }
    
}
