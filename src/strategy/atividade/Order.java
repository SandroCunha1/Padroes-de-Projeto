/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.atividade;

import strategy.interfaces.InvestStrategy;

/**
 *
 * @author aluno
 */
public class Order {
    private PayStrategy strategy;
    
    public void setStrategy(PayStrategy strategy){
        this.strategy = strategy;
    }
    public void executaPagamento(){
        this.strategy.executaPagamento();
    }
}
