/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.model;

import observer.interfaces.Observer;
import observer.interfaces.Subject;

/**
 *
 * @author aluno
 */
public class ConcreteObserver implements Observer {
    private String name;
    private Subject topic;
    
    public ConcreteObserver(String name){
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String)topic.getUpdate(this);
         if (msg == null)
             System.out.println(name + "\n Sem novas mensagens");
         else
             System.out.println(name + "\n Nova mensagem " + msg);
        
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
       }
    
}
