package Interfacess;

public interface SerVivo {

    String mover();
    String alimentar();
    void viver();

}

class Animal implements SerVivo{

    @Override
    public String mover() {
        return "Movendo-se...";
    }

    @Override
    public String alimentar() {
        return "Alimentando-se...";
    }

    @Override
    public void viver() {

    }
}
