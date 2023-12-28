package Observer_1;

public class Test {
    public static void main(String[] args) {
        Journalist journalist = new Journalist();
        journalist.registerObserver(new Newspaper());
        journalist.registerObserver(new TV());
        
        journalist.publish("Teste ","364.2","image1","texto1");
    }
}
