package Generics.inicio;

public class Generica<T> {

    private T value;

    public Generica(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void print(T msg){
        System.out.println("Sua mensagem foi: "+msg);
    }
}
