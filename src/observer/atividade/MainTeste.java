package observer.atividade;

public class MainTeste {
    public static void main(String[] args) {
        
        ConcreteSubject topic = new ConcreteSubject();
        
        Observer firstObserver = new BinaryObserver ("Binary Observer: ");
        Observer secondObserver = new OctalObserver ("Octal Observer: ");
        Observer thirdObserver = new HexaObserver ("Hexa Observer: ");
        topic.registers(firstObserver);
        topic.registers(secondObserver);
        topic.registers(thirdObserver);
        
        firstObserver.subject(topic);
        secondObserver.subject(topic);
        thirdObserver.subject(topic);
        
        topic.postNumber(10);
    }
}
