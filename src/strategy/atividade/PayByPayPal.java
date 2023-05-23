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
public class PayByPayPal implements PayStrategy {

    @Override
    public void executaPagamento() {
         JOptionPane.showMessageDialog(null, "Pagamento com PayPal realizado com sucesso!");
    }
    
}
