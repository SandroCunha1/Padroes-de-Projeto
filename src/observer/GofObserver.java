/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import observer.interfaces.Observer;
import observer.model.ConcreteObserver;
import observer.model.ConcreteSubject;

/**
 *
 * @author aluno
 */
public class GofObserver {
    public static void main(String[] args) {
        ConcreteSubject topic = new ConcreteSubject();
        
        //Cria os observers
        Observer firstObserver = new ConcreteObserver("First observer");
        Observer secondObserver = new ConcreteObserver("Second observer");
        Observer thirdObserver = new ConcreteObserver("Third observer");
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);
        
        //Linka o obeserver ao subject
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);
        
        // Retira um observador e envia uma mensagem
        topic.unregister(firstObserver);
        topic.postMassage("hello subscribers");
           }
}
