/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceinheritance;

/**
 *
 * @author tiago.lucas
 */
public class InterfaceInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a1 = new Test();
        a1.showA();
        
        B b1 = new Test();
        b1.showA();
        b1.showB();
    }
    
}
