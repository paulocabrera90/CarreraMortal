/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreramortal;

/**
 *
 * @author programador
 */
public class Rueda {
    private int codigo;
    private String marca;
    private double presion;

    public Rueda(int codigo, String marca, double presion) {
        this.codigo = codigo;
        this.marca = marca;
        this.presion = presion;
    }
    
    public Rueda(){
        this.presion = 28.0;
    }
    
    public void desinflar(){
        this.presion -= 0.5;
    }
    
    public void inflar(){
        this.presion = 28.0;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the presion
     */
    public double getPresion() {
        return presion;
    }

    /**
     * @param presion the presion to set
     */
    public void setPresion(double presion) {
        this.presion = presion;
    }
    
    
}
