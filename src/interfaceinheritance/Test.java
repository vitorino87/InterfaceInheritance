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
public class Test implements B{

    @Override
    public void showB() {
        System.out.println("showB() of B interface");
    }

    @Override
    public void showA() {
        System.out.println("showA() of A interface");
    }
    
}
