package observer.atividade;

import java.util.ArrayList;
import java.util.List;


public class ConcreteSubject implements Subject {

    
    private List<Observer> observers;
    private double numero;

    public ConcreteSubject(List<Observer> observers) {
        this.observers = observers;
    }

    public ConcreteSubject() {
        this.observers = new ArrayList<>();
    }
    
    public void postNumber(double numero){
        System.out.println("Number posted to my topic " + numero);
        this.numero = numero;
        NotifyObserver();
    }
    
    @Override
    public void registers(Observer observer) {
        if (observer == null) throw new NullPointerException("Null object/Observer");
        if (!observers.contains(observer)) observers.add(observer);
    }

    
    
    
    @Override
    public void Unregister(Observer observer) {
        observers.remove(observer);
    }

    
    
    @Override
    public void NotifyObserver() {
        for (Observer observer: observers){
            observer.update();
        }
    }

    
    
    @Override
    public Object getUpdate(Observer observer) {
        return this.numero;
    }

   
   
}

