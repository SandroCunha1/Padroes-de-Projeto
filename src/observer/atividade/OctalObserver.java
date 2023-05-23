package observer.atividade;

public class OctalObserver implements Observer {
    
    private String name;
    private Subject topic;
    
    public OctalObserver (String name){
        this.name= name;
        
        
    }
   
    @Override
    public void update(){
        double numero = (double)topic.getUpdate(this);
        
        int numeroInt = (int) numero;
        
        String octal = Integer.toOctalString(numeroInt);
        
        System.out.println(name + "novo número em octadecimal: " + octal);
              
        
    }

    @Override
    public void subject(Subject subject) {
        this.topic = subject;
    }
    
    
    
    
}
