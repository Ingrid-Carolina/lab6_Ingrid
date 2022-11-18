/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_ingridhernandez_12141186;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Billetera {
    private int ConsumoMax;
    private int Costo;

    public Billetera() {
    }

    public Billetera(int ConsumoMax, int Costo) {
        this.ConsumoMax = ConsumoMax;
        this.Costo = Costo;
    }

    public int getConsumoMax() {
        return ConsumoMax;
    }

    public void setConsumoMax(int ConsumoMax) {
        this.ConsumoMax = ConsumoMax;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    @Override
    public String toString() {
        return "Billetera{" + "ConsumoMax=" + ConsumoMax + ", Costo=" + Costo + '}';
    }
    
}
