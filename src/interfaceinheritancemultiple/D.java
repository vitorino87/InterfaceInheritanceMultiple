/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceinheritancemultiple;

/**
 *
 * @author tiago.lucas
 */
public class D implements C{

    @Override
    public void showA() {
        System.out.println("showA() of A interface");
    }

    @Override
    public void showB() {
        System.out.println("showB() of B interface");
    }

    @Override
    public void showC() {
        System.out.println("showC() of C interface");
    }
    
}
