/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.atividade;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class GofStrategy {
    public static void main(String[] args) {
        Order order = new Order();
       int tipoDePagamento = Integer.parseInt(JOptionPane.showInputDialog("Tipo de pagamento:\n\n(1) Paypal\n(2)Cartão de crédito")) ;
       if(tipoDePagamento == 1){
           order.setStrategy(new PayByPayPal());
       } else{
           order.setStrategy(new PayByCreditCard());
       }
       
       order.executaPagamento();
       
    }
}
