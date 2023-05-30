/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import javax.swing.plaf.basic.BasicBorders;

/**
 *
 * @author aluno
 */
public class Client {
    public static void main(String[] args) {
        SuperBox martelo = new Martelo();
        System.err.println(martelo.getName());
        SuperBox telefone = new Telefone();
        System.err.println(telefone.getName());
        Box newBox = new Box();
        newBox.addChildren(telefone);
        newBox.addChildren(martelo);
        System.err.println(newBox.getName());
        
    }
    
}
