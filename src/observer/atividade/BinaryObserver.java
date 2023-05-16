package observer.atividade;


public class BinaryObserver implements Observer {
    
    private String name;
    private Subject topic;
    
    
    public BinaryObserver (String name){
        this.name= name;
        
        
    }
   
    @Override
    public void update(){
        double numero = (double)topic.getUpdate(this);
        
        int numeroInt = (int) numero;
        
        String binary = Integer.toBinaryString(numeroInt);
        
        System.out.println(name + "novo número em binario: " + binary);
        
              
        
    }

    @Override
    public void subject(Subject subject) {
        this.topic = subject;
    }
    
    
    
    
}
