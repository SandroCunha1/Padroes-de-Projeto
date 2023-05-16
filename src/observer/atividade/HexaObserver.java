package observer.atividade;
public class HexaObserver implements Observer {
    
    private String name;
    private Subject topic;
    
    
    public HexaObserver (String name){
        this.name= name;
        
        
    }
   
    @Override
    public void update(){
        double numero = (double)topic.getUpdate(this);
        
        int numeroInt = (int) numero;
        
        String hexa = Integer.toHexString(numeroInt);
        
        System.out.println(name + "novo número em hexadecimal: " + hexa);
              
        
    }

    @Override
    public void subject(Subject subject) {
        this.topic = subject;
    }
    
    
    
    
}
