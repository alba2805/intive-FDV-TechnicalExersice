/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author lenovo
 */
public abstract class Rental {
    private int mi_costo;
    private int mi_unit;
    
    public Rental(int pi_cost, int pi_unit){
        this.mi_costo = pi_cost;
        this.mi_unit = pi_unit;
    }
    
    public int calculateRent(){
        return this.mi_costo * this.mi_unit;
    }

    /**
     * @return the mi_costo
     */
    public int getMi_costo() {
        return mi_costo;
    }

    /**
     * @param mi_costo the mi_costo to set
     */
    public void setMi_costo(int mi_costo) {
        this.mi_costo = mi_costo;
    }

    /**
     * @return the mi_unit
     */
    public int getMi_unit() {
        return mi_unit;
    }

    /**
     * @param mi_unit the mi_unit to set
     */
    public void setMi_unit(int mi_unit) {
        this.mi_unit = mi_unit;
    }
    
}
