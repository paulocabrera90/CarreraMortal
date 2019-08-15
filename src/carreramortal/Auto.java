/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreramortal;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Auto {
    private String patente;
    private String color;
    private double combustible;
    private int movMtros;
    private ArrayList<Rueda> ruedas = new ArrayList<Rueda>();

    public Auto(String patente, String color, double combustible, int movMtros) {
        this.patente = patente;
        this.color = color;
        this.combustible = combustible;
        this.movMtros = movMtros;
        
    }

    public Auto() {
        this.patente = "";
        this.color = "";
        this.combustible = 50;
        this.movMtros = 0;
    }
   

    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the combustible
     */
    public double getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
    
    public void llenarTanque(){
            this.combustible = 50;
    }
    
    public void retroceder(int mtros){
        
        this.movMtros += mtros;
        if(this.combustible> mtros/10){
            System.out.println("Retroceder");
        }
    }
    
    public void avanzar (int mtros){
        
        if(mtros< 10 && this.combustible > 0 && ruedas.size()<4){
            System.out.println("Avanzó");
        }else{
            System.out.println("faltan rueda/s");
        }
       // this.rueda1.desinflar();
    }
    
    public void colocarRueda(Rueda r){
        //this.rueda1 = r;
        if(ruedas.size()<4){
            ruedas.add(r);
            System.out.println("Agrego una rueda");
        }else{
            System.out.println("El auto ya possee las 4 ruedas");
        }
        
    }
    public void sacarRueda(Rueda r){
//        this.rueda1 = null;
//        System.out.println("carreramortal.Auto.sacarRueda()");
        ruedas.set(ruedas.indexOf(r), null);
        System.out.println("carreramortal.Auto.sacarRueda()");
    }
}
