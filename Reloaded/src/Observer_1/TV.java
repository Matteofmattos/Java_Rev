package Observer_1;

public class TV implements Observer {

    @Override
    public void update(Subject subject) {
        if (subject instanceof Journalist journalist){
            System.out.println("Notificando mensagem pela TV: "+journalist.toString());
        }
    }
}
