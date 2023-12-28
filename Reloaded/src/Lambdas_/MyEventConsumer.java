package Lambdas_;

@FunctionalInterface
public interface MyEventConsumer {
    public void consumer(Object value);
    default int calcula(int valor) {
        return valor*2;
    }
}
