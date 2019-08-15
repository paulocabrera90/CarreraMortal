/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreramortal;

/**
 *
 * @author Usuario
 */
public class CarreraMortal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hwello world");
        
        Auto ferrari = new Auto();
        Rueda rueda1 = new Rueda(1, "Michellini", 28.0);
        Rueda rueda2 = new Rueda(1, "Yacopini", 28.0);
        Rueda rueda3 = new Rueda(1, "Firesto", 18.0);
        Rueda rueda4 = new Rueda(1, "Mich", 25.0);
        
        ferrari.colocarRueda(rueda1);
        ferrari.colocarRueda(rueda2);
        ferrari.colocarRueda(rueda3);
        ferrari.colocarRueda(rueda4);
        ferrari.sacarRueda(rueda2);
                
    }
    
}
