package Observer_1;

public class Newspaper implements Observer {

    @Override
    public void update(Subject subject) {
        if (subject instanceof Journalist journalist){
            System.out.println("Notificando mensagem pelo newspaper: "+journalist.toString());
        }
    }
}
