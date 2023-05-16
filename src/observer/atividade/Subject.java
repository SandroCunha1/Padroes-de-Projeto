package observer.atividade;
public interface Subject {
    
    public void registers(Observer observer);
    public void Unregister (Observer observer);
    public void NotifyObserver();
    public Object getUpdate(Observer observer);
    
    
    
    
    
    
    
    
}
