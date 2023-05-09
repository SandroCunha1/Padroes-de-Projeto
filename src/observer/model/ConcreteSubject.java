/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.model;

import java.util.ArrayList;
import java.util.List;
import observer.interfaces.Observer;
import observer.interfaces.Subject;

/**
 *
 * @author aluno
 */
public class ConcreteSubject implements Subject {
    public List<Observer> observers;
    public String message;
    
    public ConcreteSubject(){
        this.observers = new ArrayList<>();
        
    }
    public void postMassage(String msg){
        System.out.println("\nMessage posted to my Topic " + msg);
        this.message = msg;
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
       if (observer == null) throw new NullPointerException("Null object/Observer");
       if (!observers.contains(observer)) observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
       for (Observer observer: observers){
           observer.update();
       }
    }

    @Override
    public Object getUpdate(Observer observer) {
      return this.message; 
    }
}
