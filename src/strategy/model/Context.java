/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.model;

import strategy.interfaces.InvestStrategy;

/**
 *
 * @author aluno
 */
public class Context {
    
    private InvestStrategy strategy;
    public Context() {
    }
    
    public void setStrategy(InvestStrategy strategy){
        this.strategy = strategy;
    }
    public double calculaJuros(double valor){
        return this.strategy.execute(valor);
    }
    
}
