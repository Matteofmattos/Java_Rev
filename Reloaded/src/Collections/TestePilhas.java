package Collections;
import java.util.Stack;

public class TestePilhas {

    static Stack<String> fila1 = new Stack<>();

    public static void main(String[] args) {

        fila1.push("1");
        fila1.push("2");
        fila1.push("3");
        fila1.push("4");

        System.out.println(fila1.peek());
        fila1.pop();
        System.out.println(fila1.peek());

    }
}
